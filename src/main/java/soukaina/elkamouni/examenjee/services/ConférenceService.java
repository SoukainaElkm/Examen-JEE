package soukaina.elkamouni.examenjee.services;

import soukaina.elkamouni.examenjee.DTOs.*;
import soukaina.elkamouni.examenjee.Entities.*;

import java.util.List;

public interface ConférenceService {
    ConférenceDTO getConféranceDTO(String id);
    List<ConférenceDTO> listConférence();
    ConférenceDTO updateConférence(String id);
    ConférenceDTO deleteConférence(String id);

    List<ParticipantDTO> listParticipant();
    InvitéDTO saveInvité(Invité invité);
    ModérateurDTO saveModérateur(Modérateur modérateur);
    SpeakerDTO saveSpeaker(Speaker speaker);
    ParticipantDTO getParticipant(Long id);
    SpeakerDTO getSpeakerDTO();
    ModérateurDTO getModérateur();
    InvitéDTO getInvité();
    ParticipantDTO updateParticipant(Long id);
    ParticipantDTO deleteParticipant(Long id);
    List<CommentaireDTO> listCommentaires();

    List<SessionDTO> listSessions();
    SessionDTO getSession(String id);

    InscriptionDTO getInscriptionDTO(String inscriptionId);

    List<InscriptionDTO> listInscriptions();
}