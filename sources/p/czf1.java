package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class czf1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jyf1 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ czf1(jyf1 jyf1Var, tob1 tob1Var, byte b) {
        super(3);
        this.a = b;
        this.b = jyf1Var;
        this.c = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jyf1 jyf1Var = this.b;
        tob1 tob1Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    qxd0.z(jyf1Var.c, mqo1.A(jyf1Var.d), (qim0) null, jyf1Var.f, ((Boolean) tob1Var.getValue()).booleanValue(), (String) null, (String) null, x340Var2, 0, 100);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    qim0 qim0VarN = anm1.N("title", pqo.h(nim0.a, ((Boolean) tob1Var.getValue()).booleanValue()));
                    String str = jyf1Var.b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, qim0VarN, cbx.d(x340Var4).g, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1712);
                }
                break;
        }
        return rih1Var;
    }
}
