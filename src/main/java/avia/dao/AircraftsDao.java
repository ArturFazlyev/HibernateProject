package avia.dao;

import avia.HibernateSessionFactory;
import avia.models.Aircrafts;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor
public class AircraftsDao {
    public Optional<Aircrafts> findByModelName(String model) {
        return HibernateSessionFactory.
                getSessionFactory()
                .openSession()
                .createQuery("FROM Aircrafts WHERE model = :model", Aircrafts.class)
                .setParameter("model", model)
                .uniqueResultOptional();
    }
}
