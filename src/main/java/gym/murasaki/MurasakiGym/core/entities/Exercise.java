package gym.murasaki.MurasakiGym.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import gym.murasaki.MurasakiGym.infrastructure.persistence.TrainingPlanEntity;
import jakarta.persistence.*;

import java.util.List;

public record Exercise(
        Long id,
        String name,
        int sets,
        int reps,
        String weight,
        String rest,
        String note,
        List<TrainingPlanEntity> trainingPlans
) {}
