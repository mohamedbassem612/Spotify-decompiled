package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qyt0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ tyt0 b;
    public final /* synthetic */ y6b1 c;
    public final /* synthetic */ cs01 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyt0(tyt0 tyt0Var, y6b1 y6b1Var, cs01 cs01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = tyt0Var;
        this.c = y6b1Var;
        this.d = cs01Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qyt0(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object objF;
        Object objInvoke;
        cs01 cs01Var = this.d;
        boolean z = this.a;
        y6b1 y6b1Var = this.c;
        pyt0 pyt0Var = pyt0.b;
        try {
            if (!z) {
                hm5.M(obj);
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.R();
                hru0VarS.x(sku0VarP);
                vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                vwu0VarR.C(TrackDecorationPolicy.newBuilder());
                hru0VarS.z(vwu0VarR);
                iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                iou0VarV.D(true);
                hru0VarS.u(iou0VarV.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                rsc0 rsc0Var = this.b.c;
                String strG = y6b1Var.g();
                playlistRequestDecorationPolicyBuild.getClass();
                trc0 trc0Var = new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
                this.a = true;
                objF = rsc0Var.f(strG, trc0Var, this);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objF = obj;
            }
            oy21 oy21Var = (py21) objF;
            fgs0 fgs0Var = new fgs0(cs01Var, (byte) 26);
            oy21Var.getClass();
            if (oy21Var instanceof ly21) {
                objInvoke = pyt0Var;
            } else {
                if (!(oy21Var instanceof oy21)) {
                    throw new NoWhenBranchMatchedException();
                }
                objInvoke = fgs0Var.invoke(oy21Var.a);
            }
            return (pyt0) objInvoke;
        } catch (Exception unused) {
            y6b1Var.g();
            return pyt0Var;
        }
    }
}
