package Dao;

import java.lang.reflect.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.TinTuc;

public class TinTucDAO extends DBContext
    {
        public TinTucDAO() 
            {
            }

        public ArrayList<TinTuc> getTinTucList() 
            {
                ArrayList<TinTuc> tinTucs = new ArrayList<>();

                String sql = "SELECT * FROM dbo.TinTuc";
                try 
                    {
                        PreparedStatement pst = connection.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) 
                            {
                                TinTuc t = new TinTuc();
                                t.setId(rs.getInt("id"));
                                t.setTieuDe(rs.getString("tieuDe"));
                                t.setNoiDung(rs.getString("noiDung"));
                                t.setTacGia(rs.getString("tacGia"));
                                t.setLuotXem(rs.getInt("luotXem"));
                                t.setNgayTao(rs.getString("ngayTao"));
                                t.setXem(rs.getString("xem"));
                                tinTucs.add(t);
                            }
                    } 
                catch (SQLException ex) 
                    {
                        ex.printStackTrace();
                    }
                return tinTucs;
            }

        public TinTuc getTinTuc(int id) 
            {
                TinTuc t = new TinTuc();

                String sql = "SELECT * FROM dbo.TinTuc WHERE id = ?";
                try 
                    {
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setInt(1, id);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) 
                            {
                                t.setId(rs.getInt("id"));
                                t.setTieuDe(rs.getString("tieuDe"));
                                t.setNoiDung(rs.getString("noiDung"));
                                t.setTacGia(rs.getString("tacGia"));
                                t.setLuotXem(rs.getInt("luotXem"));
                                t.setNgayTao(rs.getString("ngayTao"));
                                t.setXem(rs.getString("xem"));
                            }
                    } 
                catch (SQLException ex) 
                    {
                        ex.printStackTrace();
                    }
                return t;
            }
//    
        public static void main(String[] args) 
            {
                TinTucDAO pdao = new TinTucDAO();
                TinTuc rs = pdao.getTinTuc(1);
                System.out.println(rs);
            }
    }