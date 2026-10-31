package com.spotify.voiceassistants.playermodels;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "", "getSearchRequestId", "", "getResponseFeedbackDetails", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "getResponseAlternativeResults", "", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface SearchResponse {
    List<MetadataItem> getResponseAlternativeResults();

    MetadataItem getResponseFeedbackDetails();

    String getSearchRequestId();
}
