package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xcp1 extends cip1 {
    private static final xcp1 zzh;
    private int zzb;
    private String zzd = "";
    private lip1 zze;
    private lip1 zzf;
    private boolean zzg;

    static {
        xcp1 xcp1Var = new xcp1();
        zzh = xcp1Var;
        cip1.h(xcp1.class, xcp1Var);
    }

    public xcp1() {
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
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzb", "zzd", "zze", y8p1.class, "zzf", b7p1.class, "zzg"});
        }
        if (i2 == 3) {
            return new xcp1();
        }
        if (i2 == 4) {
            return new a9p1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
