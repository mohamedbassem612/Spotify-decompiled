package com.spotify.promptedplaylists.artifactpage.playlistconfig;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/promptedplaylists/artifactpage/playlistconfig/PlaylistGenerationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_promptedplaylists_artifactpage_playlistconfig-playlistconfig"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class PlaylistGenerationException extends Exception {
    public final List a;

    public PlaylistGenerationException(List list) {
        this.a = list;
    }
}
