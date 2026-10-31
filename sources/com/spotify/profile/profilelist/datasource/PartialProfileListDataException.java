package com.spotify.profile.profilelist.datasource;

import kotlin.Metadata;
import p.j8x0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/profile/profilelist/datasource/PartialProfileListDataException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_profile_profilelist-profilelist"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PartialProfileListDataException extends RuntimeException {
    public final j8x0 a;

    public PartialProfileListDataException(j8x0 j8x0Var, Throwable th) {
        super(th);
        this.a = j8x0Var;
    }
}
