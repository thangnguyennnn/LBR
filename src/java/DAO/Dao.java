package DAO;

import DBConnect.DBConnection;
import Model.Book;
import Model.User;
import Model.category;
import Model.reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<User> getListUSer() {
        try {
            String sql = "select * from [user]";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<User> list = new ArrayList<>();
            while (rs.next()) {

                list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            con.close();
            ps.close();
            rs.close();
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean checkIDExit(int id, String table) {
        try {
            String sql = "select * from [" + table + "] where id = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                return false;
            }
            ps.close();
            rs.close();
            con.close();
        } catch (Exception e) {
        }
        return true;
    }

    public int creatIDUser(String table) {
        int size = 0;
        if (table.equals("user")) {
            size = getListUSer().size() + 1;
            //System.out.println("hi" + size);
        }
        if (table.equals("category")) {
            size = getListCate().size() + 1;
            //System.out.println("cc");
        }
        if (table.equals("Book")) {
            size = getListBook().size() + 1;
        }
        do {
            if (!checkIDExit(size, table)) {
                size++;
            }
        } while (!checkIDExit(size, table));
        return size;
    }

    public List<Book> getListBook() {
        try {
            String sql = "select * from Book ";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Book> l = new ArrayList<>();
            while (rs.next()) {
                l.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            return l;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean processRegisterUser(User user) {
        try {
            String sql = "Insert into [user] values (?,?,?)";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean addCategory(category c) {
        try {
            String sql = "Insert into [category] values (?,?)";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public User checkLogin(String user, String password) {
        try {
            String sql = "select * from [user] where username = ? and password = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt(1), user, password);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<category> getListCate() {
        try {
            String sql = "select * from category";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<category> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new category(rs.getInt(1), rs.getString(2)));
            }
            return list;

        } catch (Exception e) {
        }
        return null;
    }

    public String getNameCateByID(String id) {
        try {
            String sql = "select name from category where id = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {

        }
        return "";
    }

    public boolean addBook(Book b) {
        try {
            String sql = "insert into Book values(?,?,?,?,?,?)";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, b.getId());
            ps.setString(2, b.getName());
            ps.setInt(3, b.getCateID());
            ps.setInt(4, b.getQuantity());
            ps.setString(5, b.getImg());
            ps.setString(6, b.getCreateDay());
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public Book getBookByID(String id) {
        try {
            String sql = "select * from Book where id = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public boolean updateBook(Book b) {
        try {
            String sql = "Update Book set [name] = ?,cateID = ?,quantity = ?,img = ? where id = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, b.getName());
            ps.setInt(2, b.getCateID());
            ps.setInt(3, b.getQuantity());
            ps.setString(4, b.getImg());
            ps.setInt(5, b.getId());
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean deleteBook(String id){
        try {
            String sql = "delete from Book where id = ?";
            con= new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public void deleteAllBook(){
        try {
            String sql = "delete from Book";
            con= new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<Book> getListSearchBook(String txt){
        try {
            String sql = "select * from Book where name like ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+txt+"%");
            rs = ps.executeQuery();
            List<Book> l = new ArrayList<>();
            while (rs.next()) {
                l.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            return l;
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<reader> getListReader(){
        try {
            String sql = "select * from reader";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<reader> list = new ArrayList<>();
            while(rs.next())
                list.add(new reader(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public int createIDReader(List t){
        return t.size() + 1;
    }
    
    public boolean AddReader(reader r){
        try {
            String sql = "insert into reader values(?,?,?,?,?,?,?)";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, r.getId());
            ps.setString(2, r.getName());
            ps.setInt(3, r.getBookid());                              
            ps.setString(4, r.getIndentityCard());
            ps.setString(5, r.getStartDay());
            ps.setString(6, r.getEndDay());
            ps.setString(7, r.getStt());
            int n = ps.executeUpdate();
            if(n>0)return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean traSach(String id, String ngayTra){
        try {
            String sql ="update reader set [status] = ? where id = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ngayTra);
            ps.setString(2, id);
            int n = ps.executeUpdate();
            if(n>0)return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public List<reader> getListReaderByName(String name){
        try {
            String sql ="select * from reader where name like ? and [status] = ''";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+name+"%");
            List<reader> l = new ArrayList<>();
            rs = ps.executeQuery();
            while(rs.next())
                l.add(new reader(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            return l;
        } catch (Exception e) {
            
        }
        return null;
    }
    
     public List<reader> getListReaderInHTRByName(String name){
        try {
            String sql ="select * from reader where name like ? and [status] != ''";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+name+"%");
            List<reader> l = new ArrayList<>();
            rs = ps.executeQuery();
            while(rs.next())
                l.add(new reader(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            return l;
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public void changeCate(String id){
        try {
            String sql ="update book set cateID = '0' where cateID = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void deleteCate(String id){
        try {
            String sql ="delete category where id = ?";
            con = new DBConnection().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    

    public static void main(String[] args) {
        Dao d = new Dao();
        //User u = new User(d.creatIDUser("user"), "Tantt", "tan");
        //boolean c = d.processRegisterUser(u);
//        System.out.println(d.creatIDUser("Book"));
//        //List l = d.getListUSer();
//        //System.out.println(l.size());
//        String cate = d.getNameCateByID("1");
//        System.out.println(cate);
        Book b = new Book(1, "Đắc Nhân tâm 2001", 1, 5, "123", "5/3/22");
//        System.out.println(d.updateBook(b));
        
        List<reader> l = d.getListReaderByName("");
        for (reader object : l) {
            System.out.println(object);
        }
//        System.out.println(d.createIDReader(l));
//        reader r = new reader(5, "Thắngg", 2, "215534677", "", "", "1");
//        System.out.println(d.AddReader(r));
        //System.out.println(r);
        
    }
}
