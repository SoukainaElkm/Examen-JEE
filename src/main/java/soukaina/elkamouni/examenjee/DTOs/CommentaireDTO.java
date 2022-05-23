package soukaina.elkamouni.examenjee.DTOs;

import lombok.Data;

import java.util.Date;

@Data
public class CommentaireDTO {
    private Long id;
    private Date date;
    private String contenu;
    private int nombreLikes;
}
