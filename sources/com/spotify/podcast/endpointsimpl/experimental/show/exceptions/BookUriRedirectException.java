package com.spotify.podcast.endpointsimpl.experimental.show.exceptions;

import com.spotify.episodepage.loading.exceptions.CustomErrorException;
import kotlin.Metadata;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/podcast/endpointsimpl/experimental/show/exceptions/BookUriRedirectException;", "Lcom/spotify/episodepage/loading/exceptions/CustomErrorException;", "src_main_java_com_spotify_podcast_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BookUriRedirectException extends CustomErrorException {
    public final String a;
    public final String b;

    public BookUriRedirectException(String str, String str2) {
        super(gvg.h("Show response audiobookRelations metadataextension returned an alternative book uri: ", str2, " for original uri: ", str));
        this.a = str;
        this.b = str2;
    }
}
