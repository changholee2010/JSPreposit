<%@page import="co.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
  div.reply div {
    margin: auto;
  }

  div.reply ul {
    list-style-type: none;
    margin-top: 10px;
  }

  div.reply li {
    padding-top: 1px;
    padding-bottom: 1px;
  }

  div.reply span {
    display: inline-block;
  }
</style>
<h3>상세페이지</h3>
<form name="notUse"></form>
<form name="submitForm" action="modifyForm.do">
  <input type="hidden" name="bno" value="${bvo.boardNo }">
  <input type="hidden" name="page" value="${page }">
  <input type="hidden" name="searchCondition" value="${searchCondition }">
  <input type="hidden" name="keyword" value="${keyword }">
  <table class="table">
    <tr>
      <th>글번호</th>
      <td>
        <c:out value="${bvo.boardNo }" />
      </td>
      <th>조회수</th>
      <td>
        <c:out value="${bvo.viewCnt }" />
      </td>
    </tr>
    <tr>
      <th>글내용</th>
      <td colspan="3">
        <c:out value="${bvo.content }" />
      </td>
    </tr>
    <tr>
      <th>작성자</th>
      <td>
        <c:out value="${bvo.writer }" />
      </td>
      <th>작성일시</th>
      <td>
        <c:out value="${bvo.createDate }" />
      </td>
    </tr>
    <tr>
      <td colspan="4">
        <c:if test="${not empty bvo.img }"><img src="upload/${bvo.img }" width="200px"></c:if>
      </td>
    </tr>
    <tr>
      <td colspan="4" align="center">
        <button type="submit" class="btn btn-primary">수정</button>
        <button type="button" ${logId !=bvo.writer ? 'disabled' : '' } class="btn btn-warning"
          onclick="deleteFormFunc()">삭제</button>
      </td>
    </tr>
  </table>
</form>

<div class="container reply">
  <!-- 등록. -->

  <!-- 댓글목록. -->
  <div class="content">
    <ul>
      <li>
        <span class="col-sm-2">글번호</span>
        <span class="col-sm-5">댓글내용</span>
        <span class="col-sm-2">작성자</span>
        <span class="col-sm-2">삭제</span>
      </li>
      <li>
        <hr />
      </li>
      <li style="display: none;">
        <span class="col-sm-2">11</span>
        <span class="col-sm-5">댓글입니다.</span>
        <span class="col-sm-2">user10</span>
        <button class="col-sm-2">삭제</button>
      </li>
    </ul>
  </div>

  <div class="footer">
    <div class="center">
      <div class="pagination">

      </div>
    </div>
  </div>

</div>

<!-- <script src="js/boardService.js"></script> -->
<script>
const logId = "${logId}";
const writer = "${bvo.writer}";
const bno = "${bvo.boardNo }";

</script>

<script type="module" src="js/board.js"></script>
