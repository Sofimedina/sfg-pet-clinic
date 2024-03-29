package sofitapp.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private String name;
    private Owner owner;
    private LocalDate birthDate;
    private PetType petType;

    public Pet(String name, Owner owner, LocalDate birthDate, PetType petType) {
        this.name = name;
        this.owner = owner;
        this.birthDate = birthDate;
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
