package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y8p1 extends cip1 {
    private static final y8p1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        y8p1 y8p1Var = new y8p1();
        zzg = y8p1Var;
        cip1.h(y8p1.class, y8p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", mgx0.Z0, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new y8p1();
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
