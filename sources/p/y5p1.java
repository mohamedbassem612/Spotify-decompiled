package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y5p1 extends cip1 {
    private static final y5p1 zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        y5p1 y5p1Var = new y5p1();
        zzh = y5p1Var;
        cip1.h(y5p1.class, y5p1Var);
    }

    public static v5p1 m() {
        return (v5p1) zzh.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", vbx0.a1, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new y5p1();
        }
        if (i2 == 4) {
            return new v5p1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void n(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    public final /* synthetic */ void o(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    public final /* synthetic */ void p(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    public final /* synthetic */ void q(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
