package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class icp1 extends cip1 {
    private static final icp1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        icp1 icp1Var = new icp1();
        zzf = icp1Var;
        cip1.h(icp1.class, icp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new icp1();
        }
        if (i2 == 4) {
            return new a9p1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
