package Model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Data // thay cho getter setter constructor
@Table(name = "Blog")
public class Blog {
    @Id
    @Column(name = "id")
    private int blogId;
    @Column(name = "name")
    private String blogName;
    @Column(name = "context")
    private String blogText;
    @Column(name = "created")
    private Timestamp blogDate;



   /* public Blog(int blogId, String blogName, String blogText, Date blogDate) {
        this.blogId = blogId;
        this.blogName = blogName;
        this.blogText = blogText;
        this.blogDate = blogDate;
    }

    public Blog() {

    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }

    public Date getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Date blogDate) {
        this.blogDate = blogDate;
    }*/
}