package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gcp1 extends cip1 {
    private static final gcp1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        gcp1 gcp1Var = new gcp1();
        zzf = gcp1Var;
        cip1.h(gcp1.class, gcp1Var);
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
            return new gcp1();
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
