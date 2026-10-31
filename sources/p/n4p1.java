package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n4p1 extends cip1 {
    private static final n4p1 zzk;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    static {
        n4p1 n4p1Var = new n4p1();
        zzk = n4p1Var;
        cip1.h(n4p1.class, n4p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", f4x0.Z0, "zze", c4x0.b1, "zzf", e4x0.Z0, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new n4p1();
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
