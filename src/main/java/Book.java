import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_books")
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Integer id;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "pubCompany", nullable = false)
    private String pubCompany;
    @Column(name = "pubYear", nullable = false)
    private LocalDate pubYear;
    @Column(name = "width")
    private double width;
    @Column(name = "height")
    private double height;
    @Column(name = "wigth")
    private double weight;
    @Column(name = "depth")
    private double depth;
    @Column(name = "edition")
    private int edition;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "pageNumber")
    private String pageNumber;
    @Column(name = "snopsys")
    private String snopsys;
    @Column(name = "category")
    private List<Category> category;

    @Builder
    public Book(String author, String pubCompany, LocalDate pubYear, double width, double height, double weight, double depth, int edition, String isbn, String pageNumber, String snopsys, List<Category> category) {
        this.author = author;
        this.pubCompany = pubCompany;
        this.pubYear = pubYear;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.depth = depth;
        this.edition = edition;
        this.isbn = isbn;
        this.pageNumber = pageNumber;
        this.snopsys = snopsys;
        this.category = category;
    }
}
