package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tpo1 extends iao1 {
    private static final tpo1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        tpo1 tpo1Var = new tpo1();
        zzb = tpo1Var;
        iao1.f(tpo1.class, tpo1Var);
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", c3o1.h, "zzf"});
        }
        if (i2 == 3) {
            return new tpo1();
        }
        if (i2 == 4) {
            return new ymo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
