package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class k4n1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ ff01 c;
    public final /* synthetic */ p811 d;
    public final /* synthetic */ p811 e;

    public /* synthetic */ k4n1(ff01 ff01Var, p811 p811Var, p811 p811Var2, p811 p811Var3) {
        this.c = ff01Var;
        this.b = p811Var;
        this.d = p811Var2;
        this.e = p811Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.e;
        p811 p811Var2 = this.d;
        ff01 ff01Var = this.c;
        p811 p811Var3 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 21589) {
                    return rih1Var;
                }
                if (jLongValue >= 1) {
                    byte bD = ff01Var.d();
                    boolean z = (bD & 1) == 1;
                    boolean z2 = (bD & 2) == 2;
                    boolean z3 = (bD & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue >= j) {
                        if (z) {
                            p811Var3.a = Integer.valueOf(ff01Var.h());
                        }
                        if (z2) {
                            p811Var2.a = Integer.valueOf(ff01Var.h());
                        }
                        if (!z3) {
                            return rih1Var;
                        }
                        p811Var.a = Integer.valueOf(ff01Var.h());
                        return rih1Var;
                    }
                    k220.i("bad zip: extended timestamp extra too short");
                } else {
                    k220.i("bad zip: extended timestamp extra too short");
                }
                return null;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 != 1) {
                    return rih1Var;
                }
                if (p811Var3.a != null) {
                    k220.i("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else {
                    if (jLongValue2 == 24) {
                        p811Var3.a = Long.valueOf(ff01Var.i());
                        p811Var2.a = Long.valueOf(ff01Var.i());
                        p811Var.a = Long.valueOf(ff01Var.i());
                        return rih1Var;
                    }
                    k220.i("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
        }
    }

    public /* synthetic */ k4n1(p811 p811Var, ff01 ff01Var, p811 p811Var2, p811 p811Var3) {
        this.b = p811Var;
        this.c = ff01Var;
        this.d = p811Var2;
        this.e = p811Var3;
    }
}
