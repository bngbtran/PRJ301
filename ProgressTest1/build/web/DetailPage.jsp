<%@page import = "Model.TinTuc"%>
<%@page contentType = "text/html" pageEncoding = "UTF-8"%>

<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset=UTF-8">
        <title>Detail Page</title>
        <link rel = "stylesheet" href = "./Css/MyStyle.css">
    </head>
    
    <body>
        <%@include file = "Header.jsp" %>
        
<!----------------------------------------------------------------------------->

        <%
            TinTuc t = (TinTuc)request.getAttribute("tintuc");
        %>
        
        <div class = "detail_text">
            <h1>Bài viết</h1>
            <h2>Tiêu Đề</h2>   
            <h3><%= t.getTieuDe()%></h3>
            <h2>Nội Dung</h2>
            <h3><%= t.getNoiDung()%></h3>
            <h2>Tác Giả</h2>
            <h3><%= t.getTacGia()%></h3>
        </div>
        
        <button class = "return_button"><a href = "HomePage.jsp">Home</a></button>
        
<!----------------------------------------------------------------------------->
        
        <%@include file="Footer.jsp" %>
    </body>
    
</html>