package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import spotify.collection.esperanto.proto.CollectionAlbumDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ l3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        zl5 zl5Var = this.b;
        switch (b) {
            case 0:
                return new rfr0(d5p1.t(new qsc0(zob1Var, zl5Var, str, (byte) 18), (u9c0) zl5Var.o, ey71.a, zl5.y(str, (ioj0) zob1Var.getValue())), false);
            default:
                r5h r5hVar = ((egr) ((kn6) zl5Var.f)).a;
                e0h e0hVarO = CollectionAlbumDecorationPolicy.o();
                e0hVarO.r((AlbumSyncDecorationPolicy) AlbumSyncDecorationPolicy.newBuilder().setOfflineState(true).build());
                e0hVarO.n((AlbumDecorationPolicy) AlbumDecorationPolicy.newBuilder().setLink(true).build());
                CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicyBuild = e0hVarO.build();
                b4h b4hVarN = CollectionGetArtistViewRequest.n();
                b4hVarN.r(str);
                b4hVarN.n(collectionAlbumDecorationPolicyBuild);
                return new rfr0(d5p1.t(yoi1.g(Observable.combineLatest(r5hVar.d(b4hVarN.build()).map(uml1.U0), ((z141) zl5Var.h).a, new myq0(zl5Var, str, (byte) 2))), (u9c0) zl5Var.o, new alb1(0L, Long.MAX_VALUE), z6x.a), false);
        }
    }
}
