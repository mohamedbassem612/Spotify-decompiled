package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lep1 extends cip1 {
    private static final lep1 zzh;
    private int zzb;
    private int zzd;
    private lip1 zze;
    private lip1 zzf;
    private int zzg;

    static {
        lep1 lep1Var = new lep1();
        zzh = lep1Var;
        cip1.h(lep1.class, lep1Var);
    }

    public lep1() {
        rjp1 rjp1Var = rjp1.e;
        this.zze = rjp1Var;
        this.zzf = rjp1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzb", "zzd", icx0.a1, "zze", dbp1.class, "zzf", dbp1.class, "zzg"});
        }
        if (i2 == 3) {
            return new lep1();
        }
        if (i2 == 4) {
            return new sdp1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
