package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformGetContextItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r860 {
    public final w4h a;
    public final llm b;

    public r860(w4h w4hVar, q8n q8nVar) {
        this.a = w4hVar;
        this.b = smo1.e(q8nVar);
    }

    public final ezc a(int i) {
        s4h s4hVarN = CollectionPlatformGetContextItemsRequest.n();
        s4hVarN.n();
        return yoi1.g(this.a.callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamGetContextItems", s4hVarN.build()).map(zhm0.N0).map(new ij81(i, (byte) 16)));
    }
}
