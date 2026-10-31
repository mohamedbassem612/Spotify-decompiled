package com.spotify.liveroom.commonimpl;

import kotlin.Metadata;
import p.jy21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/liveroom/commonimpl/ListPlaybackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_liveroom_commonimpl-commonimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ListPlaybackException extends Exception {
    public final jy21 a;

    public ListPlaybackException(jy21 jy21Var) {
        super(jy21Var.b());
        this.a = jy21Var;
    }
}
