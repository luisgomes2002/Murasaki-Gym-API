package gym.murasaki.MurasakiGym.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingPlanRepository extends JpaRepository<TrainingPlanEntity, Long> {
}
