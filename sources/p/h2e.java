package p;

import com.spotify.casita.v1.resolved.ResolvedHome;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h2e extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ l2t c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2e(l2t l2tVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = l2tVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new h2e(this.c, lnmVar, (byte) 0);
            case 1:
                return new h2e(this.c, lnmVar, (byte) 1);
            case 2:
                return new h2e(this.c, lnmVar, (byte) 2);
            default:
                return new h2e(this.c, lnmVar, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        l2t l2tVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                obj = l2tVar.E(this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                sy21 sy21Var = (sy21) obj;
                if ((sy21Var != null ? (ResolvedHome) sy21Var.b : null) != null) {
                    return obj;
                }
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objE = l2tVar.E(this);
                    return objE == d9nVar ? d9nVar : objE;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objE2 = l2tVar.E(this);
                    return objE2 == d9nVar ? d9nVar : objE2;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objE3 = l2tVar.E(this);
                    return objE3 == d9nVar ? d9nVar : objE3;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
