package gym.murasaki.MurasakiGym.infrastructure.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Exercises")
public class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int sets;
    private int reps;
    private String weight;
    private String rest;
    private String note;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "tb_exercise_training_plans",
            joinColumns = @JoinColumn(name = "exercise_id"), // Foreing Key
            inverseJoinColumns = @JoinColumn(name = "training_plan_id")
    )
    private List<TrainingPlanEntity> trainingPlans;

    public ExerciseEntity() {
    }

    public ExerciseEntity(String name, int sets, int reps, String weight, String rest, String note, List<TrainingPlanEntity> trainingPlans) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.rest = rest;
        this.note = note;
        this.trainingPlans = trainingPlans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<TrainingPlanEntity> getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(List<TrainingPlanEntity> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }
}
