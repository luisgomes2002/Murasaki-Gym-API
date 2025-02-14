package gym.murasaki.MurasakiGym.infrastructure.presentation;

import gym.murasaki.MurasakiGym.infrastructure.persistence.TrainingPlanEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/training-plan/")
public class TrainingPlanController {

    @PostMapping("create")
    public String createTrainingPlan(@RequestBody TrainingPlanEntity trainingPlan){
        return "Treino criado";
    }
}
