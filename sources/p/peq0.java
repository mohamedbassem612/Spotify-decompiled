package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class peq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qeq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ peq0(qeq0 qeq0Var, byte b) {
        super(2);
        this.a = b;
        this.b = qeq0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qeq0 qeq0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    th61 th61Var = (th61) rwq.g(qeq0Var.d, (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                    if (th61Var == null) {
                        x340Var2.i0(-1447778580);
                    } else {
                        x340Var2.i0(-1447778579);
                        qeq0Var.c.i(th61Var, qeq0Var.a.a, (qim0) null, x340Var2, 0);
                        x340Var2 = x340Var2;
                    }
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(781929265, new peq0(qeq0Var, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
