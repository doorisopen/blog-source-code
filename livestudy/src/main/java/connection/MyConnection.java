package connection;

public interface MyConnection<T> {
    T connectToToken() throws Exception;

    T connectToAnonymous() throws Exception;
}
