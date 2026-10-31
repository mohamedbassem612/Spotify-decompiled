package p;

import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jme1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jme1(int i, int i2, jfe jfeVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = i;
        this.d = i2;
        this.e = jfeVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new jme1(i2, i, (jfe) obj2, lnmVar);
            default:
                return new jme1((hmm0) obj2, i2, i, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objF;
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (i2 > i) {
                        tj31 tj31Var = new tj31("onLoad");
                        this.b = true;
                        if (((jfe) obj2).b(tj31Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    rsc0 rsc0Var = (xrc0) ((hmm0) obj2).g;
                    iqz0 iqz0Var = new iqz0(i2, i);
                    hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                    iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                    iou0VarV.D(true);
                    hru0VarS.v(iou0VarV);
                    trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 478);
                    this.b = true;
                    objF = rsc0Var.f("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", trc0Var, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                return ((py21) objF).d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jme1(hmm0 hmm0Var, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = hmm0Var;
        this.c = i;
        this.d = i2;
    }
}
