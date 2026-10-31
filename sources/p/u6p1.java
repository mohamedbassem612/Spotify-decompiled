package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u6p1 extends cip1 {
    private static final u6p1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private w2p1 zzf;

    static {
        u6p1 u6p1Var = new u6p1();
        zzg = u6p1Var;
        cip1.h(u6p1.class, u6p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", icx0.Z0, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new u6p1();
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
