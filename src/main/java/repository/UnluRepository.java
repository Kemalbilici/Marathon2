package repository;

import entity.Unlu;

public class UnluRepository extends RepositoryManager<Unlu, Long>{

    public UnluRepository() {
        super(new Unlu());
    }
}
