package com.spotify.podcast.endpointsimpl.experimental.show.exceptions;

import com.spotify.episodepage.loading.exceptions.CustomErrorException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/podcast/endpointsimpl/experimental/show/exceptions/CountryRestrictedException;", "Lcom/spotify/episodepage/loading/exceptions/CustomErrorException;", "<init>", "()V", "src_main_java_com_spotify_podcast_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CountryRestrictedException extends CustomErrorException {
    public CountryRestrictedException() {
        super("Show response playability metadataextension returned an country restricted exception.");
    }
}
