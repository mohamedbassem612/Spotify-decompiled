package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class us3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zau0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ lsm0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us3(boolean z, zau0 zau0Var, ven0 ven0Var, lsm0 lsm0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = zau0Var;
        this.d = ven0Var;
        this.e = lsm0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new us3(this.b, this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new us3(this.b, this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lsm0 lsm0Var = this.e;
        zau0 zau0Var = this.c;
        boolean z = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (z && zau0Var != null) {
                    r091 r091VarA = zau0Var.a();
                    ven0Var.setValue(r091VarA);
                    if (r091VarA != null) {
                        r091VarA.c();
                        r091VarA.b(lsm0Var);
                        r091.f(r091VarA, (tv80) null, (Long) null, wky0.a, 7);
                    }
                } else {
                    r091 r091Var = (r091) ven0Var.getValue();
                    if (r091Var != null) {
                        r091Var.g();
                    }
                    ven0Var.setValue((Object) null);
                }
                break;
            default:
                hm5.M(obj);
                if (z && zau0Var != null) {
                    r091 r091VarA2 = zau0Var.a();
                    ven0Var.setValue(r091VarA2);
                    if (r091VarA2 != null) {
                        r091VarA2.c();
                        r091VarA2.b(lsm0Var);
                        r091.f(r091VarA2, (tv80) null, (Long) null, ojy0.a, 7);
                    }
                } else {
                    r091 r091Var2 = (r091) ven0Var.getValue();
                    if (r091Var2 != null) {
                        r091Var2.g();
                    }
                    ven0Var.setValue((Object) null);
                }
                break;
        }
        return rih1Var;
    }
}
