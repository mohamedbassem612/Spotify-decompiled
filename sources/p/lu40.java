package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lu40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mu40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu40(mu40 mu40Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mu40Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mu40 mu40Var = this.c;
        switch (b) {
            case 0:
                return new lu40(mu40Var, lnmVar, (byte) 0);
            case 1:
                return new lu40(mu40Var, lnmVar, (byte) 1);
            default:
                return new lu40(mu40Var, lnmVar, (byte) 2);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mu40 mu40Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    tu40 tu40Var = mu40Var.a;
                    this.b = true;
                    return tu40Var.b(bc30.c1, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    uu40 uu40Var = mu40Var.b;
                    this.b = true;
                    return uu40Var.b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tu40 tu40Var2 = mu40Var.a;
                f710 f710Var = new f710(mu40Var, (byte) 28);
                this.b = true;
                return tu40Var2.c(zt40.b, f710Var, bc30.d1, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
