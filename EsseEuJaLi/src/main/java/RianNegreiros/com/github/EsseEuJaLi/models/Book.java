package RianNegreiros.com.github.EsseEuJaLi.models;

import javax.persistence.*;

@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String author;
  private String genre;
  private int pages;
  private boolean read;

  public Book(String title, String author, String genre, int pages) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.pages = pages;
    this.read = false;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getGenre() {
    return genre;
  }

  public int getPages() {
    return pages;
  }

  public boolean isRead() {
    return read;
  }

  public void setRead(boolean read) {
    this.read = read;
  }
}
