package com.spotify.puffin.core.domain.usecases;

import kotlin.Metadata;
import p.l3c1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/puffin/core/domain/usecases/GetFawFilterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_puffin_core-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class GetFawFilterException extends Exception {
    public final l3c1 a;

    public GetFawFilterException(l3c1 l3c1Var) {
        super("Error getting raw filter. Filter: " + l3c1Var);
        this.a = l3c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFawFilterException) && this.a.equals(((GetFawFilterException) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
