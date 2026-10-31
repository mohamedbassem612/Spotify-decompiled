package com.spotify.remoteconfig.fetcherimpl.network;

import kotlin.Metadata;
import p.sy21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/remoteconfig/fetcherimpl/network/ResolveRequestFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_remoteconfig_fetcherimpl-fetcherimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResolveRequestFailedException extends Exception {
    public final sy21 a;

    public ResolveRequestFailedException(String str, sy21 sy21Var) {
        super(str);
        this.a = sy21Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final sy21 getA() {
        return this.a;
    }
}
