package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lbp1 extends cip1 {
    private static final lbp1 zzg;
    private int zzb;
    private lip1 zzd;
    private lip1 zze;
    private bdp1 zzf;

    static {
        lbp1 lbp1Var = new lbp1();
        zzg = lbp1Var;
        cip1.h(lbp1.class, lbp1Var);
    }

    public lbp1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzd = rjp1Var;
        this.zze = rjp1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzb", "zzd", jep1.class, "zze", u6p1.class, "zzf"});
        }
        if (i2 == 3) {
            return new lbp1();
        }
        if (i2 == 4) {
            return new a9p1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
