package kodlama.io.kodlamaioDev.business.responses.technologyResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTechnologyById {
    private int id;
    private String name;
    private int languageId;
    private String languageName;
}
