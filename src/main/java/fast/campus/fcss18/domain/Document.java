package fast.campus.fcss18.domain;

import lombok.Getter;

@Getter
public class Document {
    private final String owner;

    public Document(String owner) {
        this.owner = owner;
    }
}
