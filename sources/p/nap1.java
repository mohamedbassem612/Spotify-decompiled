package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nap1 extends cip1 {
    private static final nap1 zzh;
    private int zzb;
    private float zze;
    private int zzg;
    private String zzd = "";
    private iip1 zzf = shp1.e;

    static {
        nap1 nap1Var = new nap1();
        zzh = nap1Var;
        cip1.h(nap1.class, nap1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003$\u0004င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new nap1();
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
