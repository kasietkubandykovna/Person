package dao.daoImpl;

import dao.SocialMediaDao;
import datebase.DateBase;
import models.Person;
import models.SocialMedia;

import java.util.List;
import java.util.stream.Collectors;

public class SocialMediaDaoImpl implements SocialMediaDao {
    public static long socialMediaIdCounter = 0;
    @Override
    public void assignSocialMediaToPerson(Person person, SocialMedia socialMedia) {

        socialMedia.setId(++socialMediaIdCounter);
        socialMedia.setId(person.getIdPerson());
        DateBase.socialMedias.add(socialMedia);
        System.out.println("Assigned " + socialMedia + " to " + person);
    }

    @Override
    public String saveSocialMedia(SocialMedia socialMedia) {
        socialMedia.setId(++socialMediaIdCounter);
      DateBase.socialMedias.add(socialMedia);
        return "SocialMedia saved: " + socialMedia;
    }

    @Override
    public SocialMedia getSocialMediaById(Long id) {
        return DateBase.socialMedias.stream()
                .filter(socialMedia -> socialMedia.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<SocialMedia> getAllSocialMediaByPersonId(Long personId) {
        return DateBase.socialMedias.stream()
                .filter(socialMedia -> socialMedia.getId().equals(personId))
                .collect(Collectors.toList());

    }

    @Override
    public void deleteAllSocialMediaByPersonId(Long idPerson) {
        DateBase.socialMedias.removeIf(socialMedia -> socialMedia.getId().equals(idPerson));
        System.out.println("Deleted all social media for personId: " + idPerson);
    }

    @Override
    public void deleteSocialMediaById(Long id) {
        DateBase.socialMedias.removeIf(socialMedia -> socialMedia.getId().equals(id));
        System.out.println("Deleted social media with id: " + id);
    }
}
