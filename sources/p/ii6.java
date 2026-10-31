package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ii6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ji6 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii6(ji6 ji6Var, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = ji6Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        xf6 xf6Var;
        y3m0 y3m0VarC;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ji6 ji6Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                wh6 wh6Var = (wh6) ji6Var.b;
                a4g1 a4g1VarC = dio1.C((gj6) wh6Var.i.get(iIntValue), p7h.L(wh6Var.i) - iIntValue, (tf6) obj2);
                ven0Var.setValue((Object) null);
                if (a4g1VarC != null && (y3m0VarC = (xf6Var = (xf6) ji6Var.c).c(wh6Var.l, a4g1VarC.a, a4g1VarC.b, a4g1VarC.c, a4g1VarC.d)) != null) {
                    i8h1 i8h1Var = xf6Var.c;
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y3m0VarC.b, y3m0VarC.c.b, System.currentTimeMillis()), (xj61) null);
                }
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                wh6 wh6Var2 = (wh6) ji6Var.b;
                a4g1 a4g1VarC2 = dio1.C((gj6) wh6Var2.i.get(iIntValue2), p7h.L(wh6Var2.i) - iIntValue2, (tf6) obj2);
                ven0Var.setValue(a4g1VarC2 != null ? new nd31(a4g1VarC2) : null);
                break;
        }
        return rih1Var;
    }
}
