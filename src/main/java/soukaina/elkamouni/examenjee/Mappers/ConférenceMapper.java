package soukaina.elkamouni.examenjee.Mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import soukaina.elkamouni.examenjee.DTOs.*;
import soukaina.elkamouni.examenjee.Entities.*;

@Service
public class ConférenceMapper {

    public InvitéDTO fromInvité(Invité invité){
        InvitéDTO invitéDTO = new InvitéDTO();
        BeanUtils.copyProperties(invité, invitéDTO);
        invitéDTO.setType(invité.getClass().getSimpleName());
        return invitéDTO;
    }

    public Invité fromInvitéDTO(InvitéDTO invitéDTO){
        Invité invité = new Invité();
        BeanUtils.copyProperties(invitéDTO, invité);
        return invité;
    }

    public ModérateurDTO fromModérateur(Modérateur modérateur){
        ModérateurDTO modérateurDTO = new ModérateurDTO();
        BeanUtils.copyProperties(modérateur, modérateurDTO);
        modérateurDTO.setType(modérateur.getClass().getSimpleName());
        return modérateurDTO;
    }

    public Modérateur fromModérateurDTO(ModérateurDTO modérateurDTO){
        Modérateur modérateur = new Modérateur();
        BeanUtils.copyProperties(modérateurDTO, modérateur);
        return modérateur;
    }

    public SpeakerDTO fromSpeaker(Speaker speaker){
        SpeakerDTO speakerDTO = new SpeakerDTO();
        BeanUtils.copyProperties(speaker, speakerDTO);
        speakerDTO.setType(speaker.getClass().getSimpleName());
        return speakerDTO;
    }

    public Speaker fromSpeakerDTO(SpeakerDTO speakerDTO){
        Speaker speaker= new Speaker();
        BeanUtils.copyProperties(speakerDTO, speaker);
        return speaker;
    }

    public SessionDTO fromSession(Session session){
        SessionDTO sessionDTO = new SessionDTO();
        BeanUtils.copyProperties(session, sessionDTO);
        return sessionDTO;
    }

    public Session fromSessionDTO(SessionDTO sessionDTO){
        Session session= new Session();
        BeanUtils.copyProperties(sessionDTO, session);
        return session;
    }

    public ConférenceDTO fromConférence(Conférence conférence){
        ConférenceDTO conférenceDTO = new ConférenceDTO();
        BeanUtils.copyProperties(conférence,conférenceDTO);
        conférenceDTO.setSpeaker(fromSpeaker(conférence.getSpeaker()));
        return conférenceDTO;
    }

    public Conférence fromConférenceDTO(ConférenceDTO conférenceDTO){
        Conférence conférence = new Conférence();
        BeanUtils.copyProperties(conférenceDTO, conférence);
        conférence.setSpeaker(fromSpeakerDTO(conférenceDTO.getSpeaker()));
        return conférence;
    }
}
