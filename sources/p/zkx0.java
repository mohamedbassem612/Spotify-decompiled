package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zkx0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dlx0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zkx0(dlx0 dlx0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = dlx0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        dlx0 dlx0Var = this.c;
        switch (b) {
            case 0:
                return new zkx0(dlx0Var, lnmVar, (byte) 0);
            default:
                return new zkx0(dlx0Var, lnmVar, (byte) 1);
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
        xe01 xe01Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dlx0 dlx0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return dlx0Var.f(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                g2z g2zVar = dlx0Var.g;
                if (g2zVar == null || (xe01Var = (xe01) g2zVar.f) == null) {
                    return rih1Var;
                }
                fun0 fun0Var = new fun0(dlx0Var, (byte) 25);
                this.b = true;
                if (xe01Var.a.collect(fun0Var, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
        }
    }
}
