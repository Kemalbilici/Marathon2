package repository;

import entity.Ipucu;
public class IpucuRepository extends RepositoryManager<Ipucu, Long>{

    public IpucuRepository() {
        super(new Ipucu());
    }
}
