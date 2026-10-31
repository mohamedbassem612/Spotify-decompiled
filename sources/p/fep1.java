package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fep1 extends cip1 {
    private static final fep1 zze;
    private int zzb;
    private String zzd = "";

    static {
        fep1 fep1Var = new fep1();
        zze = fep1Var;
        cip1.h(fep1.class, fep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new fep1();
        }
        if (i2 == 4) {
            return new sdp1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
