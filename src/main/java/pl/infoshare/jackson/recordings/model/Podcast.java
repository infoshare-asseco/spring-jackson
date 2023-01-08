package pl.infoshare.jackson.recordings.model;

import lombok.Value;
import lombok.With;

import java.time.LocalDate;

public class Podcast implements Recording {
    private final Integer id;
    private final String title;
    private final LocalDate dateOfRecording;

    public Podcast(Integer id, String title, LocalDate dateOfRecording) {
        this.id = id;
        this.title = title;
        this.dateOfRecording = dateOfRecording;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Recording withId(Integer id) {
        return new Podcast(id, title, dateOfRecording);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public LocalDate getDateOfRecording() {
        return dateOfRecording;
    }

    @Override
    public RecordingType getType() {
        return RecordingType.PODCAST;
    }
}
