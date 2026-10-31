package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k0p0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ o0p0 c;
    public final /* synthetic */ fdc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0p0(o0p0 o0p0Var, fdc fdcVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o0p0Var;
        this.d = fdcVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        fdc fdcVar = this.d;
        o0p0 o0p0Var = this.c;
        switch (b) {
            case 0:
                return new k0p0(o0p0Var, fdcVar, lnmVar, (byte) 0);
            default:
                return new k0p0(o0p0Var, fdcVar, lnmVar, (byte) 1);
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fdc fdcVar = this.d;
        d9n d9nVar = d9n.a;
        o0p0 o0p0Var = this.c;
        lnm lnmVar = null;
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
                drj0 drj0Var = o0p0Var.N1;
                if (drj0Var == null) {
                    u890.C("pageVisibility");
                    throw null;
                }
                mr20 mr20VarU = rqt0.u(new r6k0(drj0Var.o(o0p0Var.N0()), (byte) 23));
                fun0 fun0Var = new fun0(fdcVar, (byte) 2);
                this.b = true;
                return mr20VarU.collect(fun0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
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
                iac0 iac0VarN0 = o0p0Var.n0();
                k0p0 k0p0Var = new k0p0(o0p0Var, fdcVar, lnmVar, (byte) 0);
                this.b = true;
                return z8p1.u(iac0VarN0, w8c0.d, k0p0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
