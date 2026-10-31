package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class njz0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ojz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njz0(ojz0 ojz0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ojz0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ojz0 ojz0Var = this.c;
        switch (b) {
            case 0:
                return new njz0(ojz0Var, lnmVar, (byte) 0);
            case 1:
                return new njz0(ojz0Var, lnmVar, (byte) 1);
            case 2:
                return new njz0(ojz0Var, lnmVar, (byte) 2);
            default:
                return new njz0(ojz0Var, lnmVar, (byte) 3);
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
        ojz0 ojz0Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mr20 mr20VarF = qqn1.f(new en70(ojz0Var.a.b0(bn70.class)));
                    j0z0 j0z0Var = new j0z0(ojz0Var, (byte) 3);
                    this.b = true;
                    if (mr20VarF.collect(j0z0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    gj5 gj5Var = ojz0Var.i;
                    njz0 njz0Var = new njz0(ojz0Var, lnmVar, (byte) 0);
                    this.b = true;
                    if (z8p1.u(gj5Var, w8c0.e, njz0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    ruz ruzVarA = ojz0Var.t.a();
                    this.b = true;
                    Object objS = smo1.s(new yjm(ruzVarA, null), this);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    ruz ruzVarA2 = ojz0Var.t.a();
                    this.b = true;
                    Object objS2 = smo1.s(new cuk(ruzVarA2, (lnm) null, (byte) 17), this);
                    if (objS2 != d9nVar) {
                        objS2 = rih1Var;
                    }
                    if (objS2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
