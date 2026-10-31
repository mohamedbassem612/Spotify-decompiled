package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y4p1 extends cip1 {
    private static final y4p1 zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        y4p1 y4p1Var = new y4p1();
        zzi = y4p1Var;
        cip1.h(y4p1.class, y4p1Var);
    }

    public static w4p1 m() {
        return (w4p1) zzi.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", o9x0.Z0, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new y4p1();
        }
        if (i2 == 4) {
            return new w4p1(zzi);
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

    public final /* synthetic */ void p(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    public final /* synthetic */ void q(int i) {
        this.zzb |= 16;
        this.zzh = i;
    }

    public final /* synthetic */ void r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
