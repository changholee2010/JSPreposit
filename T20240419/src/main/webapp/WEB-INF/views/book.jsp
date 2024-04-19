<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="js/book.js"></script>
<h3>Book Information.</h3>
<div class="register">
    <table class="table" style="width: 90%; margin: auto;">
        <tr>
            <th>도서코드</th>
            <td><input type="text" name="bcode"></td>
            <td rowspan="5" style="padding-top: 90px;">
                <p><button id="addBtn">등록</button></p>
                <button id="delBtn">선택삭제</button>
            </td>
        </tr>
        <tr>
            <th>도서명</th>
            <td><input type="text" name="bname"></td>
        </tr>
        <tr>
            <th>저자</th>
            <td><input type="text" name="author"></td>
        </tr>
        <tr>
            <th>출판사</th>
            <td><input type="text" name="company"></td>
        </tr>
        <tr>
            <th>가격</th>
            <td><input type="text" name="price"></td>
        </tr>
    </table>

</div>

<div class="list">
    <table class="table">
        <thead>
            <tr>
                <th><input type="checkbox"></th>
                <th>도서코드</th>
                <th>도서명</th>
                <th>저자</th>
                <th>출판사</th>
                <th>가격</th>
            </tr>
        </thead>
        <tbody id="blist">
            <tr>
                <td><input type="checkbox"></td>
                <td>B001</td>
                <td>:::나는 읽고 쓰고 버린다:::</td>
                <td>손웅정</td>
                <td>난다</td>
                <td>15,300</td>
                <td><button>삭제</button></td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>B002</td>
                <td>:::숲속 재봉사의 옷장:::</td>
                <td>최향랑</td>
                <td>창비</td>
                <td>14,400</td>
                <td><button>삭제</button></td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>B003</td>
                <td>:::유튜브, 제국의 탄생:::</td>
                <td>마크 버겐</td>
                <td>현대지성</td>
                <td>22,500</td>
                <td><button>삭제</button></td>
            </tr>
        </tbody>
    </table>
</div>
