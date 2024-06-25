package dao;

import models.Person;
import models.SocialMedia;

import java.util.List;

public interface SocialMediaDao {
    void assignSocialMediaToPerson(Person person,SocialMedia socialMedia);
    String saveSocialMedia(SocialMedia socialMedia);
    SocialMedia getSocialMediaById(Long id);
    List<SocialMedia> getAllSocialMediaByPersonId(Long personId);
    void deleteAllSocialMediaByPersonId(Long idPerson);
    void deleteSocialMediaById(Long id);
}
