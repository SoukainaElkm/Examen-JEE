package soukaina.elkamouni.examenjee.DTOs;

import lombok.Data;
import soukaina.elkamouni.examenjee.Enums.InscriptionStatus;

import java.util.Date;

@Data
public class InscriptionDTO {
    private Long id;
    private Date date;
    private InscriptionStatus statut;
    private Double prix;
    private InvitéDTO invité;
    private SessionDTO session;

}
