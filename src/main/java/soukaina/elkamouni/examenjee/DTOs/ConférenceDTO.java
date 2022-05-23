package soukaina.elkamouni.examenjee.DTOs;

import lombok.Data;

import java.util.Date;

@Data
public class ConférenceDTO {
    private String id;
    private String titre;
    private Date date;
    private Date heureDébut;
    private Date heureFin;
    private String description;
    private SpeakerDTO speaker;
    private SessionDTO session;
}
