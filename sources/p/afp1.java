package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class afp1 extends cip1 {
    private static final afp1 zzh;
    private int zzb;
    private String zzd = "";
    private long zze;
    private long zzf;
    private cfp1 zzg;

    static {
        afp1 afp1Var = new afp1();
        zzh = afp1Var;
        cip1.h(afp1.class, afp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new afp1();
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
