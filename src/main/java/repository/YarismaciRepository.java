package repository;

import entity.Yarismaci;

public class YarismaciRepository extends RepositoryManager<Yarismaci, Long>{

    public YarismaciRepository() {
        super(new Yarismaci());
    }
}
