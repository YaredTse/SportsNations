package hello;

public class GreetingTwo {

    private final long id;
    private final String content;

    public GreetingTwo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
