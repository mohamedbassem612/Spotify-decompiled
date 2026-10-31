package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class obp1 extends cip1 {
    private static final obp1 zze;
    private int zzb;
    private int zzd;

    static {
        obp1 obp1Var = new obp1();
        zze = obp1Var;
        cip1.h(obp1.class, obp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", e2x0.e1});
        }
        if (i2 == 3) {
            return new obp1();
        }
        if (i2 == 4) {
            return new a9p1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
