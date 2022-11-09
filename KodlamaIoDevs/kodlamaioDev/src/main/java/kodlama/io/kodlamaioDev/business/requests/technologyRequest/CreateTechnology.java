package kodlama.io.kodlamaioDev.business.requests.technologyRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnology {
    private String name;
    private int languageId;
}
