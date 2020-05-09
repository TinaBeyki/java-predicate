import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    private String name;
    private Long population;

    public String toString() {
        return "Country Information: " + "\n"
                + "name : " + name + "\n"
                + "population : " + population;
    }
}
