package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zwk1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bxk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwk1(bxk1 bxk1Var, byte b) {
        super(4);
        this.a = b;
        this.b = bxk1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        boolean z = true;
        bxk1 bxk1Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                fwk1 fwk1Var = (fwk1) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? (x340Var.g(fwk1Var) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    bxk1Var.f.a(new yxe1(new ehc1(fwk1Var.c)));
                    nyx.a(2, (wux) null, apo.r(1773653094, new eii1(fwk1Var, iu30Var, (byte) 24), x340Var2), x340Var2, 3078, 6);
                }
                break;
            default:
                cwk1 cwk1Var = (cwk1) obj;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(cwk1Var) : x340Var3.i(cwk1Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    x340Var4.b0();
                } else if (!(cwk1Var instanceof awk1)) {
                    x340Var4.i0(-1591574008);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-1591733534);
                    boolean zI = x340Var4.i(bxk1Var);
                    if ((iIntValue2 & 14) != 4 && ((iIntValue2 & 8) == 0 || !x340Var4.i(cwk1Var))) {
                        z = false;
                    }
                    boolean z2 = zI | z;
                    Object objT = x340Var4.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new t6j1(bxk1Var, cwk1Var, null, (byte) 15);
                        x340Var4.s0(objT);
                    }
                    qxd0.t(rih1Var, x340Var4, (vu30) objT);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
