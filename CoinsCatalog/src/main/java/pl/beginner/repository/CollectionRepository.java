package pl.beginner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.beginner.model.Collection;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Long> {

}
