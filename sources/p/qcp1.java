package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qcp1 extends cip1 {
    private static final qcp1 zzk;
    private int zzb;
    private b7p1 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private lip1 zzj = rjp1.e;

    static {
        qcp1 qcp1Var = new qcp1();
        zzk = qcp1Var;
        cip1.h(qcp1.class, qcp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzb", "zzd", "zze", p5x0.a1, "zzf", i5x0.Z0, "zzg", kcx0.a1, "zzh", m9x0.a1, "zzi", "zzj", b7p1.class});
        }
        if (i2 == 3) {
            return new qcp1();
        }
        if (i2 == 4) {
            return new a9p1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
