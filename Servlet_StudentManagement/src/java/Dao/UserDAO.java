package Dao;

import Model.*;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class UserDAO 
    {
        private static final String FILE_PATH = "C:\\Users\\Administrator\\Desktop\\PRJ301\\Servlet_StudentManagement\\web\\WEB-INF\\users.json";

        public List<User> getUsers() throws IOException, ParseException 
            {
                List<User> users = new ArrayList<>();
                try 
                    {
                        FileReader FR = new FileReader("C:\\Users\\Administrator\\Desktop\\PRJ301\\Servlet_StudentManagement\\web\\WEB-INF\\users.json");
                        JSONParser parser = new JSONParser();
                        JSONArray userListJson = (JSONArray) parser.parse(FR);
                        for (Object obj : userListJson) 
                            {
                                JSONObject userJson = (JSONObject) obj;
                                Long id = (Long) userJson.get("id");
                                String name = (String) userJson.get("username");
                                String password = (String) userJson.get("password");
                                User u = new User(id, name, password);
                                System.out.println(u);
                                users.add(u);
                            }
                    }
                catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
               return users;
            }
    }