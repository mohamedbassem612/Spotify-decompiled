package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bso1 extends iao1 {
    private static final bso1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        bso1 bso1Var = new bso1();
        zzb = bso1Var;
        iao1.f(bso1.class, bso1Var);
    }

    public static vro1 q() {
        return (vro1) zzb.k();
    }

    public static /* synthetic */ void r(bso1 bso1Var, boolean z) {
        bso1Var.zzd |= 8;
        bso1Var.zzh = z;
    }

    public static /* synthetic */ void s(bso1 bso1Var, int i) {
        bso1Var.zzd |= 16;
        bso1Var.zzi = i;
    }

    public static /* synthetic */ void t(bso1 bso1Var, long j) {
        bso1Var.zzd |= 4;
        bso1Var.zzg = j;
    }

    public static /* synthetic */ void u(bso1 bso1Var) {
        bso1Var.zzd |= 32;
        bso1Var.zzj = 0;
    }

    public static /* synthetic */ void v(bso1 bso1Var) {
        bso1Var.zzd |= 2;
        bso1Var.zzf = true;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new bso1();
        }
        if (i2 == 4) {
            return new vro1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
