package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u9p1 extends cip1 {
    private static final u9p1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        u9p1 u9p1Var = new u9p1();
        zzf = u9p1Var;
        cip1.h(u9p1.class, u9p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new u9p1();
        }
        if (i2 == 4) {
            return new a9p1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
