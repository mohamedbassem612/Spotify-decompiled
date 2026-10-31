package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rra1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ asa1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rra1(Object obj, lnm lnmVar, asa1 asa1Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = asa1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        asa1 asa1Var = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                rra1 rra1Var = new rra1(obj2, lnmVar, asa1Var, (byte) 0);
                rra1Var.c = obj;
                return rra1Var;
            case 1:
                rra1 rra1Var2 = new rra1(obj2, lnmVar, asa1Var, (byte) 1);
                rra1Var2.c = obj;
                return rra1Var2;
            case 2:
                rra1 rra1Var3 = new rra1(obj2, lnmVar, asa1Var, (byte) 2);
                rra1Var3.c = obj;
                return rra1Var3;
            case 3:
                rra1 rra1Var4 = new rra1(obj2, lnmVar, asa1Var, (byte) 3);
                rra1Var4.c = obj;
                return rra1Var4;
            case 4:
                rra1 rra1Var5 = new rra1(obj2, lnmVar, asa1Var, (byte) 4);
                rra1Var5.c = obj;
                return rra1Var5;
            default:
                rra1 rra1Var6 = new rra1(obj2, lnmVar, asa1Var, (byte) 5);
                rra1Var6.c = obj;
                return rra1Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        asa1 asa1Var = this.e;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = asa1.n;
                    return asa1Var.e((vr20) this.c, (vqa1) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return asa1Var.d((vr20) this.c, (uqa1) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy2 = asa1.n;
                    return asa1Var.c((vr20) this.c, (tqa1) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy3 = asa1.n;
                    return asa1Var.b((vr20) this.c, (rqa1) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy4 = asa1.n;
                    return asa1Var.j((vr20) this.c, (yqa1) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z5) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            default:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy5 = asa1.n;
                    return asa1Var.i((vr20) this.c, (xqa1) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z6) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
        }
    }
}
