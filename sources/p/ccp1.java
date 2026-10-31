package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ccp1 extends cip1 {
    private static final ccp1 zze;
    private int zzb;
    private int zzd;

    static {
        ccp1 ccp1Var = new ccp1();
        zze = ccp1Var;
        cip1.h(ccp1.class, ccp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", h2x0.b1});
        }
        if (i2 == 3) {
            return new ccp1();
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
