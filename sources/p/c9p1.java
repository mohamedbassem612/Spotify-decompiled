package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9p1 extends cip1 {
    private static final c9p1 zzk;
    private int zzb;
    private lip1 zzd = rjp1.e;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;

    static {
        c9p1 c9p1Var = new c9p1();
        zzk = c9p1Var;
        cip1.h(c9p1.class, c9p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zzd", s7p1.class, "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new c9p1();
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
