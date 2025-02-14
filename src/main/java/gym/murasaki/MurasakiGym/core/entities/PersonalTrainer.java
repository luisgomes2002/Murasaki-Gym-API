package gym.murasaki.MurasakiGym.core.entities;

import gym.murasaki.MurasakiGym.core.enums.UserTypes;

import java.util.Date;
import java.util.List;

public record PersonalTrainer(
        Long id,
        String name,
        String email,
        String password,
        UserTypes type,
        Date created_at,
        int age,
        List<Student> students,
        List<TrainingPlan> trainingPlans,
        String note
) {}
