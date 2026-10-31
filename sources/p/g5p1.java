package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g5p1 extends cip1 {
    private static final g5p1 zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        g5p1 g5p1Var = new g5p1();
        zzi = g5p1Var;
        cip1.h(g5p1.class, g5p1Var);
    }

    public static e5p1 m() {
        return (e5p1) zzi.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", u9x0.a1, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new g5p1();
        }
        if (i2 == 4) {
            return new e5p1(zzi);
        }
        if (i2 == 5) {
            return zzi;
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

    public final /* synthetic */ void p(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void q(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    public final /* synthetic */ void r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
