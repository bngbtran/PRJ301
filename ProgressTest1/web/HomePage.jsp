<%@page import = "java.util.ArrayList"%>
<%@page import = "Model.TinTuc"%>
<%@page import = "Dao.TinTucDAO"%>
<%@page contentType = "text/html" pageEncoding = "UTF-8"%>

<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel = "stylesheet" href = "./Css/MyStyle.css">
    </head>
    
    <body>
        <%@include file = "Header.jsp" %>

<!----------------------------------------------------------------------------->

        <div class = "header_text">
            <h1>Danh sách tin tức:</h1>
            <h3>Số lượng tin tức hiện có: 188</h3>
        </div>
    
        <table class = "table">
            <tr>
                <th>ID</th>
                <th>Tiêu Đề</th>
                <th>Nội Dung</th>
                <th>Tác Giả</th>
                <th>Lượt Xem</th>
                <th>Ngày Tạo</th>
                <th>Xem Chi Tiết</th>
            </tr>
            <%
                TinTucDAO ttdao = new TinTucDAO();
                ArrayList<TinTuc> list = ttdao.getTinTucList();
                if (list != null && !list.isEmpty()) 
                    {
                        for (TinTuc t : list) 
                            {
            %>
            <tr>
                <th class = "table_data"><%= t.getId()%></th>
                <th class = "table_data"><%= t.getTieuDe()%></th>
                <th class = "table_data"><%= t.getNoiDung()%></th>
                <th class = "table_data"><%= t.getTacGia()%></th>
                <th class = "table_data"><%= t.getLuotXem()%></th>
                <th class = "table_data"><%= t.getNgayTao()%></th>
                <th class = "table_data"><a id = "chi_tiet" href ="chi-tiet-bai-viet?id=<%= t.getId()%>"><%= t.getXem()%></a></th>
            </tr>
            <%
                            }
                    }
            %>
        </table>
        
<!----------------------------------------------------------------------------->

        <%@include file = "Footer.jsp" %>
    </body>
    
</html>