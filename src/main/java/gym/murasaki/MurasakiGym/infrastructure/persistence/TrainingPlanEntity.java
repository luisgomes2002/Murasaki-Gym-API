package gym.murasaki.MurasakiGym.infrastructure.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Training_plans")
public class TrainingPlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "personal_trainer_id")  // Foreing Key
    private PersonalTrainerEntity personalTrainer;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "tb_training_plan_students",
            joinColumns = @JoinColumn(name = "training_plan_id"), // Foreing Key
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<StudentEntity> students;

    private String goals;
    private int timesCompleted;
    private int maxTimeCompleted;

    @OneToMany(mappedBy = "trainingPlans")
    private List<ExerciseEntity> Exercises;

    private String note;

    public TrainingPlanEntity() {
    }

    public TrainingPlanEntity(PersonalTrainerEntity personalTrainer, List<StudentEntity> students, String goals, int timesCompleted, int maxTimeCompleted, List<ExerciseEntity> exercises, String note) {
        this.personalTrainer = personalTrainer;
        this.students = students;
        this.goals = goals;
        this.timesCompleted = timesCompleted;
        this.maxTimeCompleted = maxTimeCompleted;
        Exercises = exercises;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalTrainerEntity getPersonalTrainer() {
        return personalTrainer;
    }

    public void setPersonalTrainer(PersonalTrainerEntity personalTrainer) {
        this.personalTrainer = personalTrainer;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public int getTimesCompleted() {
        return timesCompleted;
    }

    public void setTimesCompleted(int timesCompleted) {
        this.timesCompleted = timesCompleted;
    }

    public int getMaxTimeCompleted() {
        return maxTimeCompleted;
    }

    public void setMaxTimeCompleted(int maxTimeCompleted) {
        this.maxTimeCompleted = maxTimeCompleted;
    }

    public List<ExerciseEntity> getExercises() {
        return Exercises;
    }

    public void setExercises(List<ExerciseEntity> exercises) {
        Exercises = exercises;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
