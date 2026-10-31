package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j4p1 extends cip1 {
    private static final j4p1 zze;
    private int zzb;
    private int zzd;

    static {
        j4p1 j4p1Var = new j4p1();
        zze = j4p1Var;
        cip1.h(j4p1.class, j4p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", o9x0.Y0});
        }
        if (i2 == 3) {
            return new j4p1();
        }
        if (i2 == 4) {
            return new lcn1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
