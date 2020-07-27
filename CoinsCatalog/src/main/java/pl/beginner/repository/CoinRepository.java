package pl.beginner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pl.beginner.model.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {

	@Query(value = "SELECT * FROM Coins c WHERE c.name LIKE %?1%", nativeQuery = true)
	public List<Coin> search(String keyword);
}
