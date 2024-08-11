<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>TodoList</title>
  <link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
  
  <h1>TodoList</h1>

<h3>전체 Todo 개수 : ${fn:length(todoList)}/
    완료된 TODO 개수 : ${completeCount}</h3>

    <hr>

    <h4>할 일 추가</h4>

    <form action="/todo/add" method="post" id="addForm">
    
      <div>
        제목 : <input type="text" name="title">
      </div>

      <div>
        상세 목록 <br>
        <textarea name="detail" row="3" cols="50" placeholder="상세내용을 입력해 주세요">
        </textarea>
      <br>
      </div>
        <button>추가</button>

    </form>

    <hr>  
   <table id="todoList" border="1">
    <thead>
      <tr>
        <th>번호</th>
        <th>할 일 여부</th>
        <th>완료 여부</th>
        <th>등록 날짜</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${todoList}" var="todo" varStatus="vs">
      <tr>
        <th>${vs.count}</th>
        <td>
          <a href="#">${todo.title}</a>
        </td>
        <th>
          <c:if test="${todo.complete}">O</c:if>
          <c:if test="${not todo.complete}">X</c:if>
        </th>
        <td>${todo.regDate}</td>
      </tr>
      </c:forEach>
    </tbody>
   </table>
  
  <c:if test="${not empty sessionScope.message}">

  <script>
    alert("${message}");
  </script>

  <c:remove var="message" scope="session" />

  </c:if>
<script src="/resources/js/main.js"></script>
</body>
</html>