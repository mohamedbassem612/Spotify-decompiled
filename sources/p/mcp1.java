package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mcp1 extends cip1 {
    private static final mcp1 zzl;
    private int zzb;
    private scn1 zzd;
    private lip1 zze;
    private lip1 zzf;
    private lip1 zzg;
    private String zzh;
    private long zzi;
    private int zzj;
    private String zzk;

    static {
        mcp1 mcp1Var = new mcp1();
        zzl = mcp1Var;
        cip1.h(mcp1.class, mcp1Var);
    }

    public mcp1() {
        rjp1 rjp1Var = rjp1.e;
        this.zze = rjp1Var;
        this.zzf = rjp1Var;
        this.zzg = rjp1Var;
        this.zzh = "";
        this.zzk = "";
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001a\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဂ\u0002\u0007᠌\u0003\bဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", p3p1.class, "zzg", rbp1.class, "zzh", "zzi", "zzj", bjx0.b1, "zzk"});
        }
        if (i2 == 3) {
            return new mcp1();
        }
        if (i2 == 4) {
            return new a9p1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
