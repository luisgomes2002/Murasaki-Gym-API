package gym.murasaki.MurasakiGym.infrastructure.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import gym.murasaki.MurasakiGym.core.enums.UserTypes;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Students")
public class StudentEntity extends Users{

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "tb_student_personal_trainers",
            joinColumns = @JoinColumn(name = "student_id"), // Foreing Key
            inverseJoinColumns = @JoinColumn(name = "personal_trainer_id")
    )
    private List<PersonalTrainerEntity> personalTrainers;

    @JsonIgnore
    @ManyToMany(mappedBy = "students")
    private List<TrainingPlanEntity> trainingPlans;

    public StudentEntity(){
        super();
    }

    public StudentEntity(String name, String email, String password, UserTypes type, Date created_at, Date updated_at, int age, List<PersonalTrainerEntity> personalTrainers, List<TrainingPlanEntity> trainingPlans) {
        super(name, email, password, type, created_at, updated_at, age);
        this.personalTrainers = personalTrainers;
        this.trainingPlans = trainingPlans;
    }

    public List<PersonalTrainerEntity> getPersonalTrainers() {
        return personalTrainers;
    }

    public void setPersonalTrainers(List<PersonalTrainerEntity> personalTrainers) {
        this.personalTrainers = personalTrainers;
    }

    public List<TrainingPlanEntity> getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(List<TrainingPlanEntity> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }
}
