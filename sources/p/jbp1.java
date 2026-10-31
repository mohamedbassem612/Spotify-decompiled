package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jbp1 extends cip1 {
    private static final jbp1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        jbp1 jbp1Var = new jbp1();
        zzg = jbp1Var;
        cip1.h(jbp1.class, jbp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", b4x0.a1, "zzf"});
        }
        if (i2 == 3) {
            return new jbp1();
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
