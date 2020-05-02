package testpackage.abstraction;

public interface PersistInterface<ID> {
    void save();

    PersistInterface<ID> find(ID id);
}