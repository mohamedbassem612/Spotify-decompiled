package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v7p1 extends cip1 {
    private static final v7p1 zzk;
    private int zzb;
    private int zzd;
    private int zze;
    private jip1 zzf;
    private jip1 zzg;
    private lip1 zzh;
    private lip1 zzi;
    private int zzj;

    static {
        v7p1 v7p1Var = new v7p1();
        zzk = v7p1Var;
        cip1.h(v7p1.class, v7p1Var);
    }

    public v7p1() {
        eip1 eip1Var = eip1.e;
        this.zzf = eip1Var;
        this.zzg = eip1Var;
        rjp1 rjp1Var = rjp1.e;
        this.zzh = rjp1Var;
        this.zzi = rjp1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzb", "zzd", "zze", mgx0.Z0, "zzf", "zzg", "zzh", "zzi", "zzj", kcx0.a1});
        }
        if (i2 == 3) {
            return new v7p1();
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
