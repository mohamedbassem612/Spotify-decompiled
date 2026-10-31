package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b7p1 extends cip1 {
    private static final b7p1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        b7p1 b7p1Var = new b7p1();
        zzf = b7p1Var;
        cip1.h(b7p1.class, b7p1Var);
    }

    public static y6p1 m() {
        return (y6p1) zzf.e();
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
            return new b7p1();
        }
        if (i2 == 4) {
            return new y6p1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void n(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
