package gr.aueb.cf.eduapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserInsertDTO(

        @NotNull
        @Size(min = 3, max = 20)
        String username,

        @NotNull
        @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])^.{8,}$") // zero-length assertion -οποιοσδήποτε χαρακτήρaς, τουλάχιστον 8 οποιαδηποτε χαρακτήρες εκ των οποίων τουλάχιστον 1 ψηφίο, 1 πεζός χαρακτήρας ,1 κεφαλαίος, 1 ειδικός χαρακτήρας
        String password,

        @NotNull
        Long roleId
) {
}
