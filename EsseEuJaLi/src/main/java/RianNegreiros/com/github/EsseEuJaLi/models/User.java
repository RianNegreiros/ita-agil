package RianNegreiros.com.github.EsseEuJaLi.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private String password;
  private List<Book> booksRead;
  private int points;
  private List<String> trophies;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
    this.booksRead = new ArrayList<>();
    this.points = 0;
    this.trophies = new ArrayList<>();
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public List<Book> getBooksRead() {
    return booksRead;
  }

  public int getPoints() {
    return points;
  }

  public List<String> getTrophies() {
    return trophies;
  }

  public void addBook(Book book) {
    booksRead.add(book);
    int bookPoints = 1 + book.getPages() / 100;
    points += bookPoints;

    // Check if the user has read enough books of the same style to earn a trophy
    int booksOfStyle = 0;
    for (Book b : booksRead) {
      if (b.getGenre().equals(book.getGenre())) {
        booksOfStyle++;
      }
    }
    if (booksOfStyle % 5 == 0) {
      trophies.add("Reader of " + book.getGenre());
    }
  }
}
