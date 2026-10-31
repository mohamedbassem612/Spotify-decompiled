package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ocn1 extends cip1 {
    private static final ocn1 zzg;
    private int zzb;
    private ycn1 zzd;
    private int zze;
    private int zzf;

    static {
        ocn1 ocn1Var = new ocn1();
        zzg = ocn1Var;
        cip1.h(ocn1.class, ocn1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", "zze", mgx0.Y0, "zzf", hgx0.Z0});
        }
        if (i2 == 3) {
            return new ocn1();
        }
        if (i2 == 4) {
            return new lcn1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
