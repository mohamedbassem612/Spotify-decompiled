package p;

import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yzv0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ aru0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzv0(aru0 aru0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.b = aru0Var;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new yzv0(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        rsc0 rsc0Var = (xrc0) this.b.b;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        vwu0VarR.D(TrackDecorationPolicy.newBuilder().setName(true).setLink(true).setPlayable(true).build());
        vwu0VarR.u(ArtistDecorationPolicy.newBuilder().setName(true).build());
        hru0VarS.z(vwu0VarR);
        trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
        this.a = true;
        Object objF = rsc0Var.f(this.c, trc0Var, this);
        d9n d9nVar = d9n.a;
        return objF == d9nVar ? d9nVar : objF;
    }
}
