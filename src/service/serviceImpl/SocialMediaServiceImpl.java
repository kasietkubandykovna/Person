package service.serviceImpl;

import dao.SocialMediaDao;
import dao.daoImpl.SocialMediaDaoImpl;
import models.Person;
import models.SocialMedia;
import service.SocialMediaService;

import java.util.List;

public class SocialMediaServiceImpl implements SocialMediaService {

    SocialMediaDao socialMediaDao=new SocialMediaDaoImpl();
    @Override
    public void assignSocialMediaToPerson(Person person, SocialMedia socialMedia) {
        socialMediaDao.assignSocialMediaToPerson(person,socialMedia);
    }

    @Override
    public String saveSocialMedia(SocialMedia socialMedia) {
        return socialMediaDao.saveSocialMedia(socialMedia);
    }

    @Override
    public SocialMedia getSocialMediaById(Long id) {
        return socialMediaDao.getSocialMediaById(id);
    }

    @Override
    public List<SocialMedia> getAllSocialMediaByPersonId(Long personId) {
        return socialMediaDao.getAllSocialMediaByPersonId(personId);
    }

    @Override
    public void deleteAllSocialMediaByPersonId(Long idPerson) {
socialMediaDao.deleteAllSocialMediaByPersonId(idPerson);
    }

    @Override
    public void deleteSocialMediaById(Long id) {
socialMediaDao.deleteSocialMediaById(id);
    }
}
