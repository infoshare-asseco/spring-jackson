package pl.infoshare.jackson.recordings.model;

import lombok.Value;

public class RecordingId {
    private final Integer id;

    private final RecordingType type;

    public RecordingId(Integer id, RecordingType type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public RecordingType getType() {
        return type;
    }
}
