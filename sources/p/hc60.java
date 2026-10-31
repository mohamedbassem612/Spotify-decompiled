package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hc60 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ jkr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc60(jkr0 jkr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = jkr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new hc60(this.c, lnmVar, (byte) 0);
            case 1:
                return new hc60(this.c, lnmVar, (byte) 1);
            case 2:
                return new hc60(this.c, lnmVar, (byte) 2);
            case 3:
                return new hc60(this.c, lnmVar, (byte) 3);
            case 4:
                return new hc60(this.c, lnmVar, (byte) 4);
            default:
                return new hc60(this.c, lnmVar, (byte) 5);
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
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objG2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jkr0 jkr0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (jkr0Var.k.b()) {
                    return rih1Var;
                }
                int iO = jkr0Var.o();
                this.b = true;
                return jkr0.s(jkr0Var, iO, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                kkr0 kkr0Var = lkr0.a;
                if (((err0) jkr0Var.d.c).s() - 1 < 0 || (objG = jkr0.g(jkr0Var, ((err0) jkr0Var.d.c).s() - 1, (n8b1) null, this, 6)) != d9nVar) {
                    objG = rih1Var;
                }
                return objG == d9nVar ? d9nVar : rih1Var;
            case 2:
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
                this.b = true;
                kkr0 kkr0Var2 = lkr0.a;
                if (((err0) jkr0Var.d.c).s() + 1 >= jkr0Var.l() || (objG2 = jkr0.g(jkr0Var, ((err0) jkr0Var.d.c).s() + 1, (n8b1) null, this, 6)) != d9nVar) {
                    objG2 = rih1Var;
                }
                return objG2 == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                Object objA = jkr0Var.a(hfn0.a, new s55(2, null, (byte) 22), this);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
                return objA == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    return jkr0.g(jkr0Var, 2, (n8b1) null, this, 6) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    int iO2 = jkr0Var.o() + 1;
                    this.b = true;
                    return jkr0.g(jkr0Var, iO2, (n8b1) null, this, 6) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
