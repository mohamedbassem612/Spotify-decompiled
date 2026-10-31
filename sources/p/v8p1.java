package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v8p1 extends cip1 {
    private static final v8p1 zze;
    private int zzb;
    private int zzd;

    static {
        v8p1 v8p1Var = new v8p1();
        zze = v8p1Var;
        cip1.h(v8p1.class, v8p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", mgx0.Z0});
        }
        if (i2 == 3) {
            return new v8p1();
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
