package lt.andrius.World.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Entity
@Table(name = "balance")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Balance {

    @Id
    @Column(name = "income_id")
    private Integer income_id;
    @Column(name = "expense_id")
    private double expense_id;
    @Column(name = "balance")
    private double balance;
    @Column(name = "date")
    private String date;

}
