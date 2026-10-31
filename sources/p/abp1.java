package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class abp1 extends cip1 {
    private static final abp1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        abp1 abp1Var = new abp1();
        zzg = abp1Var;
        cip1.h(abp1.class, abp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new abp1();
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
