package repository;

import entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma, Long>{

    public YarismaRepository() {
        super(new Yarisma());
    }
}
