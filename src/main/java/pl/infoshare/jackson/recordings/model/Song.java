package pl.infoshare.jackson.recordings.model;

import lombok.Value;
import lombok.With;

import java.time.Duration;

public class Song implements Recording {
    private final Integer id;
    private final String title;
    private final Duration duration;

    public Song(Integer id, String title, Duration duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Recording withId(Integer id) {
        return new Song(id, title, duration);
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public RecordingType getType() {
        return RecordingType.SONG;
    }
}
