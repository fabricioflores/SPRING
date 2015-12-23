package spring.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.persistence.daos.UnidirectionalOneToOneEmbeddedDao;
import spring.persistence.entities.EmbeddableEntity;
import spring.persistence.entities.UnidirectionalOneToOneEmbeddedEntity;

@Controller
public class UnidirectionalOneToOneEmbeddedController {

    @Autowired
    private UnidirectionalOneToOneEmbeddedDao unidirectionalOneToOneEmbeddedDao;

    public void process() {
        EmbeddableEntity embeddable = new EmbeddableEntity(666, "daemon");
        UnidirectionalOneToOneEmbeddedEntity entity = new UnidirectionalOneToOneEmbeddedEntity("Mi Nick", embeddable);
        unidirectionalOneToOneEmbeddedDao.save(entity);
        System.out.println(">>>> UnidirectionalOneToOneEmbeddedEntity:  " + entity);
    }
}