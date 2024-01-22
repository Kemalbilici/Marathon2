package repository;

import entity.Kazanan;

public class KazananRepository extends RepositoryManager<Kazanan, Long>{

    public KazananRepository() {
        super(new Kazanan());
    }
}
