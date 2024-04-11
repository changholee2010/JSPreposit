/**
 * board.js
 */

import { svc } from './boardService.js';
console.log(svc);

svc.replyList(bno, replyListFnc2);

function replyListFnc2(result) {
	console.log(result);
	result.forEach(elem => {
		let template = document.querySelector('div.content>ul>li:nth-of-type(3)')//
			.cloneNode(true);

		template.querySelector('span:nth-of-type(1)').innerText = elem.replyNo;
		template.querySelector('span:nth-of-type(2)').innerText = elem.reply;
		template.querySelector('span:nth-of-type(3)').innerText = elem.replyer;
		template.querySelector('button').addEventListener('click', function(e) {
			if (logId != elem.replyer) {
				alert("권한이 없습니다.")
				return;
			}
			svc.removeReply(elem.replyNo, // 삭제할 댓글번호.
				// 성공했을 때 실행할 함수.
				() => template.remove(),
				// 실패했을 때 실행할 함수.
				() => alert('처리중 에러!!'));
		});
		template.style.display = 'block';
		document.querySelector('div.content>ul').appendChild(template);

	});
}

function replyListFnc1(result) {
	console.log(result);
	result.forEach(elem => {
		let li = document.createElement('li');
		let span = document.createElement('span');
		span.innerText = elem.replyNo;
		span.className = 'col-sm-2';
		li.appendChild(span);

		span = document.createElement('span');
		span.innerText = elem.reply;
		span.className = 'col-sm-6';
		li.appendChild(span);

		span = document.createElement('span');
		span.innerText = elem.replyer;
		span.className = 'col-sm-2';
		li.appendChild(span);

		let btn = document.createElement('button');
		btn.innerText = '삭제';
		btn.className = 'col-sm-2';
		li.appendChild(btn);

		// ul
		document.querySelector('div.content ul').appendChild(li);
	});
} // replyListFnc1
function deleteFormFunc() {
	document.forms[1].action = "removeForm.do";
	document.forms[1].submit();
	document.forms[1].action = "modifyForm.do";
}

// submitForm
document.querySelector('form[name="submitForm"]') //
	.addEventListener('submit', function(e) {
		e.preventDefault(); // 기본기능 차단.
		if (logId == writer) {
			this.submit();
		} else {
			alert('권한이 없습니다.');
		}
	})
