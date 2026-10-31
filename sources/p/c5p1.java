package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c5p1 extends cip1 {
    private static final c5p1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        c5p1 c5p1Var = new c5p1();
        zzf = c5p1Var;
        cip1.h(c5p1.class, c5p1Var);
    }

    public static a5p1 m() {
        return (a5p1) zzf.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", s9x0.a1, "zze"});
        }
        if (i2 == 3) {
            return new c5p1();
        }
        if (i2 == 4) {
            return new a5p1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void n(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    public final /* synthetic */ void o(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
