package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r9p1 extends cip1 {
    private static final r9p1 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        r9p1 r9p1Var = new r9p1();
        zzk = r9p1Var;
        cip1.h(r9p1.class, r9p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", a2x0.b1, "zzh", f2x0.Z0, "zzi", e2x0.d1, "zzj", h2x0.a1});
        }
        if (i2 == 3) {
            return new r9p1();
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
