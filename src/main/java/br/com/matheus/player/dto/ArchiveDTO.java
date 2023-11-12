package br.com.matheus.player.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArchiveDTO {

    private final String title;
    private final String url;
    private final String type;
    private final double durationInSeconds;

    @JsonCreator
    public ArchiveDTO(
        @JsonProperty(value = "title") final String title,
        @JsonProperty(value = "url") final String url,
        @JsonProperty(value = "type") final String type,
        @JsonProperty(value = "durationInSeconds") final double durationInSeconds) {
        this.title = title;
        this.url = url;
        this.type = type;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }


    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    public double getDurationInSeconds() {
        return durationInSeconds;
    }

}
