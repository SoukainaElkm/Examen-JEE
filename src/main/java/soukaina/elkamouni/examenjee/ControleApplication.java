package soukaina.elkamouni.examenjee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import soukaina.elkamouni.examenjee.Entities.*;
import soukaina.elkamouni.examenjee.Enums.InscriptionStatus;
import soukaina.elkamouni.examenjee.Enums.participantGenre;
import soukaina.elkamouni.examenjee.Repositories.*;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(participantRepository participantRepository,
                                        salleRepository salleRepository,
                                        sessionRepository sessionRepository,
                                        inscriptionRepository inscriptionRepository,
                                        conf√©renceRepository conf√©renceRepository){
        return args -> {

            Stream.of("soukaina", "salma").forEach(name -> {
                Speaker speaker=new Speaker();
                speaker.setNom(name);
                speaker.setEmail(name + "@gmail.com");
                speaker.setGenre(Math.random()>0.5? participantGenre.MASCULIN:participantGenre.FEMININ);
                speaker.setProfilPersonnel("speaker");
                participantRepository.save(speaker);
            });

            Stream.of("salle1", "salle2").forEach(name -> {
                Salle salle=new Salle();
                salle.setNom(name);
                salleRepository.save(salle);
            });

            salleRepository.findAll().forEach(acc->{
                for (int i = 0; i < 5; i++) {
                    Session session=new Session();
                    session.setId(UUID.randomUUID().toString());
                    session.setNom("session"+i);
                    sessionRepository.save(session);
                }
            });


            sessionRepository.findAll().forEach(session->{
                for (int i = 0; i < 5; i++) {
                    Inscription inscription= new Inscription();
                    inscription.setDate(new Date());
                    inscription.setPrix(Math.random()*1000);
                    inscription.setStatut(InscriptionStatus.EnCours);
                    inscriptionRepository.save(inscription);
                }

                for (int i = 0; i < 5; i++) {
                    Conf√©rence conf√©rence=new Conf√©rence();
                    conf√©rence.setId(UUID.randomUUID().toString());
                    conf√©rence.setDate(new Date());
                    conf√©rence.setHeureD√©but(new Date());
                    conf√©rence.setHeureFin(new Date());
                    conf√©rence.setDescription("conference"+i);
                    conf√©renceRepository.save(conf√©rence);
                }

                conf√©renceRepository.findAll().forEach(acc->{
                    for (int i = 0; i < 5; i++) {
                        Stream.of("mohammed", "hassan").forEach(name -> {
                            Mod√©rateur mod√©rateur=new Mod√©rateur();
                            mod√©rateur.setNom(name);
                            mod√©rateur.setEmail(name + "@gmail.com");
                            mod√©rateur.setGenre(participantGenre.MASCULIN);
                            mod√©rateur.setSpecialite("moderateur");
                            participantRepository.save(mod√©rateur);
                        });
                    }
                });
            });


        };
    }


}