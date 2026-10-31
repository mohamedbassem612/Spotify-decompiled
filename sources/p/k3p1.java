package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k3p1 extends cip1 {
    private static final k3p1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        k3p1 k3p1Var = new k3p1();
        zzf = k3p1Var;
        cip1.h(k3p1.class, k3p1Var);
    }

    public static h3p1 m() {
        return (h3p1) zzf.e();
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
            return new k3p1();
        }
        if (i2 == 4) {
            return new h3p1(zzf);
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

    public final /* synthetic */ void o(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }
}
