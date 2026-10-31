package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bdp1 extends cip1 {
    private static final bdp1 zze;
    private int zzb;
    private w2p1 zzd;

    static {
        bdp1 bdp1Var = new bdp1();
        zze = bdp1Var;
        cip1.h(bdp1.class, bdp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new bdp1();
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
