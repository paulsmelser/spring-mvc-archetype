package it.pkg.repositories;

import it.pkg.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by psmelser on 26/05/0.1-SNAPSHOT5.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(value = "select p from Person p where LOWER(p.firstName) = LOWER(:firstName)")
    Person getByName(@Param("firstName") String firstName);

//    List<Person> findByFirstNameAndLastName(String firstName);
}
