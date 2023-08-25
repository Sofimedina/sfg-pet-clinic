package sofitapp.model;

public class Vet extends Person{
    private Long id;
    public Vet(){
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
