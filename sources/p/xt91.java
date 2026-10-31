package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xt91 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cce b;
    public final /* synthetic */ dbp c;
    public final /* synthetic */ wt91 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt91(cce cceVar, dbp dbpVar, wt91 wt91Var, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = cceVar;
        this.c = dbpVar;
        this.d = wt91Var;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    rwq.e(this.b, this.c, this.d, ((Boolean) this.e.getValue()).booleanValue() ? n1i.d : n1i.a, nim0.a, x340Var2, 24576);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    brl.i((qim0) null, (vu30) null, (vu30) null, (hw61) null, cbx.a(x340Var4).a.c, 0L, 0L, 0L, apo.r(447932449, new xt91(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 805306368, 479);
                }
                break;
        }
        return rih1Var;
    }
}
