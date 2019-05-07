package guru.springframework.springpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType PetType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return PetType;
    }

    public void setPetType(PetType petType) {
        this.PetType = petType;
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
}
