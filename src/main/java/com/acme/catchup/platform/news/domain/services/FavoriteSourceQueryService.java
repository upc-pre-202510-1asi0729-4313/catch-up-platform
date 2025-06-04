package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregate.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourceByIdQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {

    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);

    List<FavoriteSource> handle(GetAllFavoriteSourceQuery query);
}
