package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wap1 extends cip1 {
    private static final wap1 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    static {
        wap1 wap1Var = new wap1();
        zzk = wap1Var;
        cip1.h(wap1.class, wap1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            u3x0 u3x0Var = u3x0.b1;
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", u3x0Var, "zzi", u3x0Var, "zzj"});
        }
        if (i2 == 3) {
            return new wap1();
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
