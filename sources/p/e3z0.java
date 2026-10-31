package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e3z0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oho1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3z0(oho1 oho1Var, byte b) {
        super(2);
        this.a = b;
        this.b = oho1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        oho1 oho1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    jtx jtxVar = jtx.c;
                    boolean z = oho1Var instanceof z1z0;
                    jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131959031));
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(jtxVar, jslVar, u291.r(nim0Var, 16.0f), 0L, 0L, z, x340Var2, jtx.d, 24);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    itx itxVar = itx.c;
                    boolean z2 = oho1Var instanceof x1z0;
                    jsl jslVar2 = new jsl(cwl1.o0(x340Var4, 2131959030));
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var4).g;
                    w0h1.a(itxVar, jslVar2, u291.r(nim0Var, 16.0f), 0L, 0L, z2, x340Var4, itx.d, 24);
                }
                break;
        }
        return rih1Var;
    }
}
