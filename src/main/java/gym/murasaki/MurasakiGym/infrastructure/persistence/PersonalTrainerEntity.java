package gym.murasaki.MurasakiGym.infrastructure.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import gym.murasaki.MurasakiGym.core.enums.UserTypes;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Personal_trainers")
public class PersonalTrainerEntity extends Users{
    @JsonIgnore
    @ManyToMany(mappedBy = "personalTrainers")
    private List<StudentEntity> students;

    @OneToMany(mappedBy = "personalTrainer")
    private List<TrainingPlanEntity> trainingPlans;

    private String note;

    public PersonalTrainerEntity() {
        super();
    }

    public PersonalTrainerEntity(String name, String email, String password, UserTypes type, Date created_at, Date updated_at, int age, List<StudentEntity> students, List<TrainingPlanEntity> trainingPlans, String note) {
        super(name, email, password, type, created_at, updated_at, age);
        this.students = students;
        this.trainingPlans = trainingPlans;
        this.note = note;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public List<TrainingPlanEntity> getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(List<TrainingPlanEntity> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
