package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x3f extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ryx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3f(boolean z, ryx ryxVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = z;
        this.c = ryxVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new x3f(this.c, lnmVar, (byte) 0);
            case 1:
                return new x3f(this.b, this.c, lnmVar);
            case 2:
                return new x3f(this.c, lnmVar, (byte) 2);
            case 3:
                return new x3f(this.c, lnmVar, (byte) 3);
            default:
                return new x3f(this.c, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        ryx ryxVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    b3j0 b3j0Var = new b3j0(true);
                    this.b = true;
                    if (ryxVar.e(b3j0Var, hfn0.a, this) == d9nVar) {
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
                hm5.M(obj);
                if (!this.b) {
                    ryxVar.dismiss();
                }
                return rih1Var;
            case 2:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    b3j0 b3j0Var2 = new b3j0(true);
                    this.b = true;
                    if (ryxVar.e(b3j0Var2, hfn0.a, this) == d9nVar) {
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
            case 3:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    b3j0 b3j0Var3 = new b3j0(true);
                    this.b = true;
                    if (ryxVar.e(b3j0Var3, hfn0.a, this) == d9nVar) {
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
                    b3j0 b3j0Var4 = new b3j0(true);
                    this.b = true;
                    if (ryxVar.e(b3j0Var4, hfn0.a, this) == d9nVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3f(ryx ryxVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ryxVar;
    }
}
