package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k0o1 extends iao1 {
    private static final k0o1 zzb;
    private int zzd;
    private v2o1 zze;
    private v2o1 zzf;
    private int zzg;

    static {
        k0o1 k0o1Var = new k0o1();
        zzb = k0o1Var;
        iao1.f(k0o1.class, k0o1Var);
    }

    public static g0o1 q() {
        return (g0o1) zzb.k();
    }

    public static /* synthetic */ void r(k0o1 k0o1Var, v2o1 v2o1Var) {
        k0o1Var.zze = v2o1Var;
        k0o1Var.zzd |= 1;
    }

    public static /* synthetic */ void s(k0o1 k0o1Var, v2o1 v2o1Var) {
        k0o1Var.zzf = v2o1Var;
        k0o1Var.zzd |= 2;
    }

    public static /* synthetic */ void t(k0o1 k0o1Var, int i) {
        k0o1Var.zzg = i - 1;
        k0o1Var.zzd |= 4;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", c3o1.b});
        }
        if (i2 == 3) {
            return new k0o1();
        }
        if (i2 == 4) {
            return new g0o1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
