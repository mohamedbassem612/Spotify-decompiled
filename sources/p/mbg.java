package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mbg extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbg(boolean z, iu30 iu30Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.d = iu30Var;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                return new mbg(iu30Var, ven0Var, lnmVar);
            case 1:
                return new mbg(ven0Var, iu30Var, lnmVar);
            case 2:
                return new mbg(this.b, this.d, this.c, lnmVar, (byte) 2);
            default:
                return new mbg(this.b, this.d, this.c, lnmVar, (byte) 3);
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
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    obj = iu30Var.invoke(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(rwq.q(new c470(ven0Var, (byte) 16)));
                    qv7 qv7Var = new qv7(iu30Var, (byte) 23);
                    this.b = true;
                    if (mr20VarU.collect(qv7Var, this) == d9nVar) {
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
                hm5.M(obj);
                if (this.b) {
                    ven0Var.setValue(Boolean.TRUE);
                } else if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    iu30Var.invoke(cmk0.a);
                }
                return rih1Var;
            default:
                hm5.M(obj);
                boolean z3 = this.b;
                if (z3 != ((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.valueOf(z3));
                    iu30Var.invoke(Boolean.valueOf(z3));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbg(ven0 ven0Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = ven0Var;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbg(iu30 iu30Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = iu30Var;
        this.c = ven0Var;
    }
}
