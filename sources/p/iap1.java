package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iap1 extends cip1 {
    private static final iap1 zzk;
    private int zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    static {
        iap1 iap1Var = new iap1();
        zzk = iap1Var;
        cip1.h(iap1.class, iap1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006ဆ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", r3x0.c1, "zzf", "zzg", "zzh", hcx0.a1, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new iap1();
        }
        if (i2 == 4) {
            return new a9p1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
