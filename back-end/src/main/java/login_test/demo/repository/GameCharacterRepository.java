package login_test.demo.repository;

import login_test.demo.model.GameCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameCharacterRepository extends JpaRepository<GameCharacter, Long> {

    GameCharacter findByUserId(Long userId); // userId로 GameCharacter 조회)
    List<GameCharacter> findAllByUserId(Long userId);
}
