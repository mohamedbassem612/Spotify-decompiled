package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class izj0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzj0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izj0(Object obj, lnm lnmVar, xzj0 xzj0Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = xzj0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xzj0 xzj0Var = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                izj0 izj0Var = new izj0(obj2, lnmVar, xzj0Var, (byte) 0);
                izj0Var.c = obj;
                return izj0Var;
            case 1:
                izj0 izj0Var2 = new izj0(obj2, lnmVar, xzj0Var, (byte) 1);
                izj0Var2.c = obj;
                return izj0Var2;
            case 2:
                izj0 izj0Var3 = new izj0(obj2, lnmVar, xzj0Var, (byte) 2);
                izj0Var3.c = obj;
                return izj0Var3;
            default:
                izj0 izj0Var4 = new izj0(obj2, lnmVar, xzj0Var, (byte) 3);
                izj0Var4.c = obj;
                return izj0Var4;
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
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xzj0 xzj0Var = this.e;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                v0e0 v0e0Var = xzj0Var.h;
                this.c = null;
                this.b = true;
                v0e0Var.a((vr20) this.c, (m0k0) obj2, this);
                return d9nVar;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    g2z g2zVar = xzj0Var.d;
                    this.c = null;
                    this.b = true;
                    return g2zVar.u((vr20) this.c, (x0k0) obj2, this) == d9nVar ? d9nVar : rih1Var;
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
                    mzr0 mzr0Var = xzj0Var.e;
                    this.c = null;
                    this.b = true;
                    return mzr0Var.a((vr20) this.c, (b1k0) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    cik1 cik1Var = xzj0Var.t;
                    this.c = null;
                    this.b = true;
                    return cik1Var.b((vr20) this.c, (j1k0) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
        }
    }
}
