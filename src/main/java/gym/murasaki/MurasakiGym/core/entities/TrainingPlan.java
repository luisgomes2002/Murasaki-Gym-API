package gym.murasaki.MurasakiGym.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public record TrainingPlan(
        Long id,
        PersonalTrainers personalTrainer,
        List<Student> students,
        Date today,
        String goals,
        int timesCompleted,
        int maxTimeCompleted,
        List<Exercise> Exercises,
        String note
) {}
