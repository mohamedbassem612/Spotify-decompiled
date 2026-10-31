package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n6p1 extends cip1 {
    private static final n6p1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        n6p1 n6p1Var = new n6p1();
        zzf = n6p1Var;
        cip1.h(n6p1.class, n6p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", ybx0.a1, "zze", wbx0.a1});
        }
        if (i2 == 3) {
            return new n6p1();
        }
        if (i2 == 4) {
            return new lcn1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
