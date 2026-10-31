package com.spotify.thestage.vtec.datasource;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.k2l1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/thestage/vtec/datasource/GenericViewException;", "Lp/k2l1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_thestage_vtec-vtec"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class GenericViewException extends Exception implements k2l1 {
    public final String a;

    public GenericViewException(String str) {
        super(str);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
