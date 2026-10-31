package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xep1 extends cip1 {
    private static final xep1 zzg;
    private int zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        xep1 xep1Var = new xep1();
        zzg = xep1Var;
        cip1.h(xep1.class, xep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zzd", rdx0.a1, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new xep1();
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
