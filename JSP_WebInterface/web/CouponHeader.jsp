<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>

<html>
    <head>
        <title>Coupon Header</title>
        <link rel = "stylesheet" href = "./Css/CouponHeaderStyle.css">
        
        <style class = "coupon_style">
            nav 
                {
                    display: flex;
                    justify-content: space-between;
                    background-color: #C8E2B1;
                    height : 30px;
                }
            
            .text 
                {
                    margin-left: 100px;
                    font-family: Arial, Helvetica, sans-serif;
                    margin-top: 5px;
                }

            .dropdown 
                {
                    position: relative;
                    display: inline-block;
                    margin-right: 100px;
                    font-family: Arial, Helvetica, sans-serif;
                }

            .dropbtn 
                {
                    background-color: #C8E2B1;
                    color: black;
                    padding: 5px;
                    font-size: 16px;
                    border: none;
                    cursor: pointer;
                }

            .dropdown-content 
                {
                    display: none;
                    position: absolute;
                    background-color: #C8E2B1;
                    min-width: 160px;
                    box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
                    z-index: 1;
                }

            .dropdown-content a 
                {
                    color: black;
                    padding: 12px 16px;
                    text-decoration: none;
                    display: block;
                }

            .dropdown-content a:hover 
                {
                    background-color: #C8E2B1;
                }

            .dropdown:hover .dropdown-content 
                {
                    display: block;
                }

        </style>
        
    </head>
    
    <body>
        <nav>
            <div class = "text">
                Super Value Deals - Save more with coupons
            </div>

            <div class = "dropdown">
                <button class = "dropbtn">English</button>
                <div class = "dropdown-content">
                    <a href = "#">English</a>
                    <a href = "#">Deusch</a>
                </div>
            </div>
        </nav>      
    
<!----------------------------------------------------------------------------->
    
        <div class = "header">
            <div class = "logo">
                <a href = "WishListPage.jsp"><img src = "./Image/Logo.svg"></a>
            </div>

            <form id = "search-form" action = "SearchPage.jsp" method = "GET">
                <input type = "text" id = "search-input" placeholder = "Search for products" name = "product-name">
                <button type = "submit" id = "search-button"><img src = "./Image/KínhLúp.png" alt = "Search Icon"></button>
            </form>

            <div class = "location">
                <a href = "https://www.facebook.com/2bngbtran0"><button class="btn-location"> <span>Location</span> <img src = "./Image/Location.png"></button></a>
            </div>

            <div class = "icon">
                <a href = "WishListPage.jsp"> <img src = "./Image/TráiTim.png"></a>
                <a href = "HomeLoginPage.html"> <img src = "./Image/BóngĐèn.png"></a>
                <a href = "CartPage.jsp"> <img src = "./Image/GiỏHàng.png"></a>
            </div>           
        </div> 

<!----------------------------------------------------------------------------->
       
        <div class = "header_menu">
            <ul>
                <li class = "all_depart"> <button><a class = "all_text" href="#">All Department</a></button>
                    <ul>
                        <li><a href = "#">Daily, Bread & Eggs</a></li>
                        <li><a href = "#">Snacks & Munchies</a></li>
                        <li><a href = "#">Fruits & Vegetables</a></li>
                        <li><a href = "#">Cold Drinks & Juices</a></li>
                        <li><a href = "#">Breakfast & Instant Food</a></li>
                        <li><a href = "#">Bakery & Biscuits</a></li>
                        <li><a href = "#">Chicken, Meat & Fish</a></li>
                    </ul>
                </li>

                <li><a href = "#">Home</a>
                    <ul>
                        <li><a href = "#">Home 1</a></li>
                        <li><a href = "#">Home 2</a></li>
                        <li><a href = "#">Home 3</a></li>
                        <li><a href = "#">Home 4</a></li>
                        <li><a href = "#">Home 5</a></li>
                    </ul>
                </li>

                <li><a href="#">Shop</a>
                    <ul>
                        <li><a href = "#">Shop Grid - Filter</a></li>
                        <li><a href = "#">Shop Grid - 3 column</a></li>
                        <li><a href = "#">Shop List - Filter</a></li>
                        <li><a href = "#">Shop Filter</a></li>
                        <li><a href = "#">Shop Wild</a></li>
                        <li><a href = "#">Shop Single</a></li>
                        <li><a href = "#">Shop Single v2</a></li>
                        <li><a href = "#">Shop Wishlist</a></li>
                        <li><a href = "#">Shop Cart</a></li>
                        <li><a href = "#">Shop Checkout</a></li>
                    </ul>
                </li>

                <li><a href = "#">Stores</a>
                    <ul>
                        <li><a href = "#">Store List</a></li>
                        <li><a href = "#">Store Grid</a></li>
                        <li><a href = "#">Store Single</a></li>
                    </ul>
                </li>

                <li><a href = "#">Mega Menu</a>
                    <ul class = "group_1">
                        <li class = "text_group_1"><a href = "#">Dairy, Bread & Eggs</a></li>
                        <li><a href = "#">Butter</a></li>
                        <li><a href = "#">Milk Drinks</li>
                        <li><a href = "#">Curd & Yogurt</a></li>
                        <li><a href = "#">Eggs</a></li>
                        <li><a href = "#">Buns & Bakery</a></li>
                        <li><a href = "#">Cheese</a></li>
                        <li><a href = "#">Curd & Yogurt</a></li>
                        <li><a href = "#">Condensed Milk</a></li>
                        <li><a href = "#">Dairy Products</a></li>
                    </ul>

                    <ul class = "group_2">
                        <li class = "text_group_2"><a href = "#">Breakfast & Instant Food</a></li>
                        <li><a href = "#">Breakfast Cereal</a></li>
                        <li><a href = "#">Noodles, Pasta & Soup</li>
                        <li><a href = "#">Frozen Veg Snacks</a></li>
                        <li><a href = "#">Frozen Non - Veg Snacks</a></li>
                        <li><a href = "#">Vermicelli</a></li>
                        <li><a href = "#">Instant Mixes</a></li>
                        <li><a href = "#">Batter</a></li>
                        <li><a href = "#">Fruit and Juices</a></li>
                    </ul>

                    <ul class = "group_3">
                        <li class = "text_group_3"><a href = "#">Cold Drinks & Juices</a></li>
                        <li><a href = "#">Soft Drinks</a></li>
                        <li><a href = "#">Fruit Juices</li>
                        <li><a href = "#">Coldpress</a></li>
                        <li><a href = "#">Water & Ice Cubes</a></li>
                        <li><a href = "#">Soda & Mixers</a></li>
                        <li><a href = "#">Health Drinks</a></li>
                        <li><a href = "#">Herbal Drinks</a></li>
                        <li><a href = "#">Milk Drinks</a></li>
                    </ul>
                </li>

                <li><a href = "#">Pages</a>
                    <ul>
                        <li><a href = "#">Blog</a></li>
                        <li><a href = "#">Blog Single</a></li>
                        <li><a href = "#">Blog Category</a></li>
                        <li><a href = "#">About us</a></li>
                        <li><a href = "#">404 Error</a></li>
                        <li><a href = "#">Contact</a></li>
                    </ul>
                </li>

                <li><a href = "#">Account</a>
                    <ul>
                        <li><a href = "#">Sign out</a></li>
                        <li><a href = "#">Forgot Password</a></li>
                        <li><a href = "#">My Account</a></li>
                    </ul>
                </li>

                <li>
                    <a href = "#">Dashboard</a>
                </li>

                <li><a href = "#">Docs</a>
                    <ul>
                        <li><a href = "#">Documentation</a></li>
                        <li><a href = "#">Changelog</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <hr>
</body>

</html>