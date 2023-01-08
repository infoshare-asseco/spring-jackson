package pl.infoshare.jackson.recordings.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

public class AudioBookChapter {
    private final String title;

    @JsonCreator
    public AudioBookChapter(@JsonProperty("title") String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
