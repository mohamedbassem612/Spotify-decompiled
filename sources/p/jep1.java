package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jep1 extends cip1 {
    private static final jep1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private w2p1 zzf;

    static {
        jep1 jep1Var = new jep1();
        zzg = jep1Var;
        cip1.h(jep1.class, jep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", n9x0.a1, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new jep1();
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
