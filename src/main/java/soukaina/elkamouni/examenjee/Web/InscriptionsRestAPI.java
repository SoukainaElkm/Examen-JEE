package soukaina.elkamouni.examenjee.Web;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import soukaina.elkamouni.examenjee.DTOs.InscriptionDTO;
import soukaina.elkamouni.examenjee.services.ConférenceServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class InscriptionsRestAPI {
    private ConférenceServiceImpl conférenceService;

    @GetMapping("/inscriptions/{inscriptionId}")
    public InscriptionDTO getInscription(@PathVariable String inscriptionId){
        return conférenceService.getInscriptionDTO(inscriptionId);
    }

    @GetMapping("/inscriptions")
    public List<InscriptionDTO> listInscriptions(){
        return conférenceService.listInscriptions();
    }
}
