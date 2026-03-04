package gr.aueb.cf.eduapp.core.filters;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TeacherFilters {
    private UUID uuid;      // μοναδικά αποτ/τα
    private String vat;     // μοναδικά αποτ/τα
    private String amka;    // μοναδικά αποτ/τα
    private String lastname;
    private boolean deleted;
    private String region;


}
