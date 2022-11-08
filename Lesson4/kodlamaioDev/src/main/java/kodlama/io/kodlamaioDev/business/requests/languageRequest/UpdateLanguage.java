package kodlama.io.kodlamaioDev.business.requests.languageRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguage {
    private int id;
    private String name;
}
