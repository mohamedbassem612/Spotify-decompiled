package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ng90 implements kg90 {
    public final w4h a;

    public ng90(w4h w4hVar) {
        this.a = w4hVar;
    }

    public final mr20 a(String str) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.h);
        u4hVarQ.r(str);
        u4hVarQ.s();
        return new zx60(yoi1.g(this.a.callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamGet", u4hVarQ.build()).map(b6j0.O0)), (byte) 4);
    }
}
