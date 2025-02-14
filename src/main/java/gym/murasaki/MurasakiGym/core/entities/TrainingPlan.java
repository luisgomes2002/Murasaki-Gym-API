package gym.murasaki.MurasakiGym.core.entities;

import java.util.Date;
import java.util.List;

public record TrainingPlan(
        Long id,
        PersonalTrainer personalTrainer,
        List<Student> students,
        Date today,
        String goals,
        int timesCompleted,
        int maxTimeCompleted,
        List<Exercise> Exercises,
        String note
) {}
