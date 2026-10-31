package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pb6 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vb6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb6(vb6 vb6Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = vb6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        pb6 pb6Var = new pb6(this.c, lnmVar);
        pb6Var.b = obj;
        return pb6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                vb6 vb6Var = this.c;
                rsc0 rsc0Var = vb6Var.d;
                String str = vb6Var.f;
                iqz0 iqz0Var = new iqz0(0, 10);
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                vwu0VarR.A();
                vwu0VarR.D(TrackDecorationPolicy.newBuilder().setLink(true).build());
                hru0VarS.z(vwu0VarR);
                mr20 mr20VarK = rsc0Var.k(str, new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 478));
                this.b = null;
                this.a = true;
                obj = b5p1.i(mr20VarK, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable unused) {
        }
        return rih1.a;
    }
}
