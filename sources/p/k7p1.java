package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k7p1 extends cip1 {
    private static final k7p1 zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private lip1 zzg = rjp1.e;

    static {
        k7p1 k7p1Var = new k7p1();
        zzh = k7p1Var;
        cip1.h(k7p1.class, k7p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", i7p1.class});
        }
        if (i2 == 3) {
            return new k7p1();
        }
        if (i2 == 4) {
            return new lcn1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
