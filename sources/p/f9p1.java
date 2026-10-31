package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f9p1 extends cip1 {
    private static final f9p1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private y8p1 zzf;

    static {
        f9p1 f9p1Var = new f9p1();
        zzg = f9p1Var;
        cip1.h(f9p1.class, f9p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new f9p1();
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
