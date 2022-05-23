package soukaina.elkamouni.examenjee.Web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import soukaina.elkamouni.examenjee.DTOs.CommentaireDTO;
import soukaina.elkamouni.examenjee.DTOs.ConférenceDTO;
import soukaina.elkamouni.examenjee.DTOs.ParticipantDTO;
import soukaina.elkamouni.examenjee.DTOs.SessionDTO;
import soukaina.elkamouni.examenjee.Entities.Session;
import soukaina.elkamouni.examenjee.services.ConférenceServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class ConférenceRestAPI {
    private ConférenceServiceImpl conférenceService;


    @GetMapping("/conferences/{conferenceId}")
    public ConférenceDTO getConférence(@PathVariable String conferenceId){
        return conférenceService.getConféranceDTO(conferenceId);
    }

    @GetMapping("/conferences")
    public List<ConférenceDTO> listConférences(){
        return conférenceService.listConférence();
    }
    @GetMapping("/participants")
    public List<ParticipantDTO> listParticipant(){
        return conférenceService.listParticipant();
    }

    @GetMapping("/participants/{participantId}")
    public ParticipantDTO getParticipant(@PathVariable Long participantId){
        return conférenceService.getParticipant(participantId);
    }

    @GetMapping("/conferences/{conferenceId}/commentaires")
    public List<CommentaireDTO> listCommentaires(){
        return conférenceService.listCommentaires();
    }

    @GetMapping("/sessions")
    public List<SessionDTO> listSessions(){
        return conférenceService.listSessions();
    }

    @GetMapping("/sessions/{sessionId}")
    public SessionDTO getSession(@PathVariable String sessionId){
        return conférenceService.getSession(sessionId);
    }
}
