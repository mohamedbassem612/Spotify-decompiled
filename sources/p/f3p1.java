package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f3p1 extends cip1 {
    private static final f3p1 zzk;
    private int zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private lip1 zzh;
    private lip1 zzi;
    private String zzj;

    static {
        f3p1 f3p1Var = new f3p1();
        zzk = f3p1Var;
        cip1.h(f3p1.class, f3p1Var);
    }

    public f3p1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzh = rjp1Var;
        this.zzi = rjp1Var;
        this.zzj = "";
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzb", "zzd", r5x0.b1, "zze", "zzf", kcx0.a1, "zzg", "zzh", dbp1.class, "zzi", dbp1.class, "zzj"});
        }
        if (i2 == 3) {
            return new f3p1();
        }
        if (i2 == 4) {
            return new lcn1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
