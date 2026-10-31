package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tep1 extends cip1 {
    private static final tep1 zzg;
    private int zzb;
    private String zzd = "";
    private int zze;
    private nap1 zzf;

    static {
        tep1 tep1Var = new tep1();
        zzg = tep1Var;
        cip1.h(tep1.class, tep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", djx0.b1, "zzf"});
        }
        if (i2 == 3) {
            return new tep1();
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
