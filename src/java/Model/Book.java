package Model;

public class Book {
    private int id;
    private String name;
    private int cateID;
    private int quantity;
    private String img;
    private String createDay;

    public Book(int id, String name, int cateID, int quantity, String img, String createDay) {
        this.id = id;
        this.name = name;
        this.cateID = cateID;
        this.quantity = quantity;
        this.img = img;
        this.createDay = createDay;
    }

    
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cate) {
        this.cateID = cate;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", cateID=" + cateID + ", quantity=" + quantity + ", img=" + img + ", createDay=" + createDay + '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }
    
    
}
