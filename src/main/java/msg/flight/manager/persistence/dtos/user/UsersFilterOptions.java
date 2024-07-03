package msg.flight.manager.persistence.dtos.user;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersFilterOptions {
    @NotNull
    private String company;
    @NotNull
    private List<String> roles;
    @NotNull
    private String fullName;
}
