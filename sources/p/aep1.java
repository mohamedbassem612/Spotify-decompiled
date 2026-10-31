package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aep1 extends cip1 {
    private static final aep1 zzi;
    private int zzb;
    private int zzd;
    private long zze;
    private lip1 zzf;
    private lip1 zzg;
    private lip1 zzh;

    static {
        aep1 aep1Var = new aep1();
        zzi = aep1Var;
        cip1.h(aep1.class, aep1Var);
    }

    public aep1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzf = rjp1Var;
        this.zzg = rjp1Var;
        this.zzh = rjp1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"zzb", "zzd", l9x0.b1, "zze", "zzf", edp1.class, "zzg", y4p1.class, "zzh", qdp1.class});
        }
        if (i2 == 3) {
            return new aep1();
        }
        if (i2 == 4) {
            return new sdp1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
