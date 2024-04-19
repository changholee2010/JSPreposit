/**
 * book.js
 */
console.log('start')
document.addEventListener('DOMContentLoaded', function(e) {
	// 1.도서목록 출력하도록 작성하세요.
	let tbody = document.querySelector('#blist');
	tbody.innerHTML = '';

	fetch('bookListJson.do')
		.then(resolve => resolve.json())
		.then(result => {
			result.forEach(book => {
				console.log(book);
				tbody.append(makeRow(book));
			})
		})

	// 2.등록이벤트를 작성하세요.
	document.querySelector('#addBtn').addEventListener('click', function(e) {
		console.log(document.querySelectorAll('div.register input[id]'))
		let book = {}
		book.bookCode = document.querySelector('#bcode').value;
		book.bookTitle = document.querySelector('#bname').value;
		book.author = document.querySelector('#author').value;
		book.company = document.querySelector('#company').value;
		book.price = document.querySelector('#price').value;

		fetch('bookAddJson.do', {
			method: 'post',
			headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
			body: 'bookCode=' + book.bookCode + '&bookTitle=' + book.bookTitle + '&author=' + book.author + '&company=' + book.company + '&price=' + book.price
		})
			.then(resolve => resolve.json())
			.then(result => {
				if (result.retCode == 'Success') {
					tbody.append(makeRow(book));
				}
			})
			.catch(console.error);

	})

	// 3.선택삭제 이벤트를 작성하세요.
	document.querySelector('#delBtn').addEventListener('click', function(e) {
		document.querySelectorAll('#blist input:checked').forEach(item => {
			let tr = item.parentElement.parentElement;
			delCallback(item.parentElement.parentElement.dataset.id, () => {
				tr.remove();
			})
		})
	})

	// 필요하면 함수를 작성하세요.
	function makeRow(book = {}) {
		const fields = ['bookCode', 'bookTitle', 'author', 'company', 'price'];
		let tr = document.createElement('tr');
		tr.setAttribute('data-id', book.bookCode)

		// checkbox.
		let td = document.createElement('td');
		let elem = document.createElement('input');
		elem.setAttribute('type', 'checkbox');
		td.append(elem);
		tr.append(td);

		// td.
		fields.forEach(field => {
			let td = document.createElement('td');
			td.innerHTML = book[field];
			tr.append(td);
		})

		// button.
		td = document.createElement('td');
		elem = document.createElement('button');
		elem.innerHTML = '삭제';
		elem.addEventListener('click', delBtnFnc)
		td.append(elem);
		tr.append(td);

		return tr;
	} // end of makeRow.

	function delBtnFnc(e) {
		let bcode = e.target.parentElement.parentElement.dataset.id;
		delCallback(bcode, () => {
			e.target.parentElement.parentElement.remove();
		})
	}

	function delCallback(bcode, successCall) {
		fetch('bookRemoveJson.do', {
			method: 'post',
			headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
			body: 'bcode=' + bcode
		})
			.then(resolve => resolve.json())
			.then(result => {
				if (result.retCode == 'Success') {
					successCall();
				}
			})
			.catch(console.error);
	}
})