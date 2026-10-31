package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hdp1 extends cip1 {
    private static final hdp1 zzh;
    private int zzb;
    private long zzd;
    private boolean zze;
    private long zzf;
    private boolean zzg;

    static {
        hdp1 hdp1Var = new hdp1();
        zzh = hdp1Var;
        cip1.h(hdp1.class, hdp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new hdp1();
        }
        if (i2 == 4) {
            return new a9p1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
