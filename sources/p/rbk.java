package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rbk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbk(sbk sbkVar, byte b) {
        super(1);
        this.a = b;
        this.b = sbkVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        sbk sbkVar = this.b;
        switch (b) {
            case 0:
                w4h w4hVar = ((sd41) sbkVar.h).b;
                u4h u4hVarQ = CollectionPlatformItemsRequest.q();
                u4hVarQ.t(w5h.c);
                return new qbk(yoi1.g(w4hVar.callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamGet", u4hVarQ.build()).map(b6j0.O0).map(wbx0.i)), (nbk) obj, (byte) 0);
            default:
                ((qtr) obj).b(new js(sbkVar, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
