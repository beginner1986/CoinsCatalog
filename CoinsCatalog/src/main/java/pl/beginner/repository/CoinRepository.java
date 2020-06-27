package pl.beginner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.beginner.model.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {

}
