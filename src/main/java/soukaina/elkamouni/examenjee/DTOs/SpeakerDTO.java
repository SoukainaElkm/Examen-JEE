package soukaina.elkamouni.examenjee.DTOs;

import lombok.Data;
import soukaina.elkamouni.examenjee.Enums.participantGenre;

@Data
public class SpeakerDTO extends ParticipantDTO {
    private Long id;
    private String nom;
    private String email;
    private String photo;
    private participantGenre genre;
    private String profilPersonnel;
}
