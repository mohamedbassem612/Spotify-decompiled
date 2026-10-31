package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cfp1 extends cip1 {
    private static final cfp1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        cfp1 cfp1Var = new cfp1();
        zzg = cfp1Var;
        cip1.h(cfp1.class, cfp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zzd", gex0.Z0, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new cfp1();
        }
        if (i2 == 4) {
            return new sdp1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
