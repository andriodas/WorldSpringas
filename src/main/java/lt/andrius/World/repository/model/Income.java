package lt.andrius.World.repository.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "income")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Income {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "amount")
    private double amount;
    @Column(name = "date")
    private String date;

}
