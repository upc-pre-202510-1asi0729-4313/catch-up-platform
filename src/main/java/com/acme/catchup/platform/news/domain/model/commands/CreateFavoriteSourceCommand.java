package com.acme.catchup.platform.news.domain.model.commands;

public record CreateFavoriteSourceCommand(String newsApiKey, String sourceId) {

    public CreateFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty()) {
            throw new IllegalArgumentException("News api key cannot be empty");
        }
        if (sourceId == null || sourceId.isEmpty()) {
            throw new IllegalArgumentException("Source id cannot be empty");
        }
    }
}
