package Model;
public class reader {
    private int id;
    private String name;
    private int bookid;
    private String indentityCard;
    private String startDay;
    private String endDay;
    private String stt;

    public reader(int id, String name, int bookid, String indentityCard, String startDay, String endDay, String stt) {
        this.id = id;
        this.name = name;
        this.bookid = bookid;
        this.indentityCard = indentityCard;
        this.startDay = startDay;
        this.endDay = endDay;
        this.stt = stt;
    }

    @Override
    public String toString() {
        return "reader{" + "id=" + id + ", name=" + name + ", bookid=" + bookid + ", indentityCard=" + indentityCard + ", startDay=" + startDay + ", endDay=" + endDay + ", stt=" + stt + '}';
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

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getIndentityCard() {
        return indentityCard;
    }

    public void setIndentityCard(String indentityCard) {
        this.indentityCard = indentityCard;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
    
    
}
