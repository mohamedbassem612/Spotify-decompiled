package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rs91 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ j2i c;

    public /* synthetic */ rs91(j2i j2iVar, vu30 vu30Var, int i) {
        this.a = (byte) 0;
        this.c = j2iVar;
        this.b = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 2;
        j2i j2iVar = this.c;
        vu30 vu30Var = this.b;
        x340 x340Var = (b0k) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                cxm.j(czo1.p(1), j2iVar, x340Var, vu30Var);
                break;
            case 1:
                int iIntValue = num.intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    kiv kivVar = wql.a;
                    long j = ((u7h) x340Var2.k(xrl.a)).a;
                    mod.b(kivVar.a(Float.valueOf((!((bbh) x340Var2.k(cbh.a)).d() ? ((double) z4p1.B(j)) < 0.5d : ((double) z4p1.B(j)) > 0.5d) ? 0.87f : 1.0f)), apo.r(1236486620, new rs91(vu30Var, j2iVar, b2), x340Var2), x340Var2, 56);
                }
                break;
            case 2:
                int iIntValue2 = num.intValue();
                x340 x340Var3 = x340Var;
                if (!x340Var3.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var3.b0();
                } else {
                    s9e1.a(((m2h1) x340Var3.k(q2h1.b)).j, apo.r(1789628237, new rs91(vu30Var, j2iVar, (byte) 3), x340Var3), x340Var3, 48);
                }
                break;
            default:
                int iIntValue3 = num.intValue();
                x340 x340Var4 = x340Var;
                if (!x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var4.b0();
                } else if (vu30Var != null) {
                    x340Var4.i0(1845823628);
                    cxm.j(0, j2iVar, x340Var4, vu30Var);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1845819398);
                    cxm.n(0, j2iVar, x340Var4);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ rs91(vu30 vu30Var, j2i j2iVar, byte b) {
        this.a = b;
        this.b = vu30Var;
        this.c = j2iVar;
    }
}
