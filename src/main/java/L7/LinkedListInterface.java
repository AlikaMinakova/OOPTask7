package L7;

public interface LinkedListInterface<T> {
    public void add(T value);

    public Entity<T> delete();

    public Entity<T> delete(T value);

    public Entity<T> findByValue(T value);

    public int size();

    public Entity<T> getHead();

    public Entity<T> getTail();
}
