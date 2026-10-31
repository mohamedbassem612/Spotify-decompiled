package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class r1c implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1c(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                t1c.a((qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                fpb0 fpb0Var = (fpb0) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    g890 g890VarQ = fpb0Var.b.d.q(i);
                    ((bpb0) g890VarQ.c).d.J(gpb0.a, Integer.valueOf(i - g890VarQ.a), x340Var2, 6);
                }
                break;
            case 2:
                ktb0 ktb0Var = (ktb0) obj3;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    g890 g890VarQ2 = ktb0Var.b.c.q(i);
                    ((htb0) g890VarQ2.c).c.J(ktb0Var.c, Integer.valueOf(i - g890VarQ2.a), x340Var4, 0);
                }
                break;
            case 3:
                qub0 qub0Var = (qub0) obj3;
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    g890 g890VarQ3 = qub0Var.b.c.q(i);
                    ((nub0) g890VarQ3.c).d.J(rub0.a, Integer.valueOf(i - g890VarQ3.a), x340Var6, 6);
                }
                break;
            default:
                sjr0 sjr0Var = (sjr0) obj3;
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    g890 g890VarQ4 = sjr0Var.b.B().q(i);
                    ((mjr0) g890VarQ4.c).b.J(yjr0.a, Integer.valueOf(i - g890VarQ4.a), x340Var8, 0);
                }
                break;
        }
        return rih1Var;
    }
}
