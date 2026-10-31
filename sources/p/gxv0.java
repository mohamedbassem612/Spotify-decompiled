package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gxv0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public ven0 b;
    public boolean c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxv0(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.b = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.d;
        switch (b) {
            case 0:
                return new gxv0(ven0Var2, ven0Var, lnmVar, (byte) 0);
            case 1:
                return new gxv0(ven0Var2, ven0Var, lnmVar, (byte) 1);
            default:
                return new gxv0(this.b, ven0Var2, ven0Var, lnmVar);
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
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var2.getValue()) != null) {
                        return rih1Var;
                    }
                    m441 m441VarQ = rwq.q(new q2j0(ven0Var, (byte) 25));
                    zio0 zio0Var = new zio0(2, (lnm) null, (byte) 14);
                    this.b = ven0Var2;
                    this.c = true;
                    obj = b5p1.j(m441VarQ, zio0Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var2 = this.b;
                    hm5.M(obj);
                }
                ven0Var2.setValue(Boolean.valueOf(((v760) obj).a()));
                return rih1Var;
            case 1:
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    wt91 wt91Var = (wt91) ven0Var2.getValue();
                    if (wt91Var == null) {
                        return rih1Var;
                    }
                    ven0Var.setValue(Boolean.TRUE);
                    long j = wt91Var.b;
                    this.b = ven0Var2;
                    this.c = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var2 = this.b;
                    hm5.M(obj);
                }
                ven0Var2.setValue((Object) null);
                return rih1Var;
            default:
                ven0 ven0Var3 = this.b;
                boolean z3 = this.c;
                if (!z3) {
                    hm5.M(obj);
                    if (!((Boolean) ven0Var3.getValue()).booleanValue() || !(ven0Var2.getValue() instanceof xqj1) || ((Boolean) ven0Var.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    this.c = true;
                    if (hap1.i(3000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var3.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxv0(ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = ven0Var;
        this.e = ven0Var2;
    }
}
