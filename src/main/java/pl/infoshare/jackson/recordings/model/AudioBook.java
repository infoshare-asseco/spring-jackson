package pl.infoshare.jackson.recordings.model;

import lombok.Value;
import lombok.With;

import java.util.List;

public class AudioBook implements Recording {
    private final Integer id;
    private final String title;
    private final List<AudioBookChapter> chapters;

    public AudioBook(Integer id, String title, List<AudioBookChapter> chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Recording withId(Integer id) {
        return new AudioBook(id, title, chapters);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<AudioBookChapter> getChapters() {
        return chapters;
    }

    @Override
    public RecordingType getType() {
        return RecordingType.AUDIOBOOK;
    }
}
