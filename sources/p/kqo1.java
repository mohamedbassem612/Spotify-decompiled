package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqo1 extends iao1 {
    private static final kqo1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private doo1 zzg;
    private noo1 zzh;

    static {
        kqo1 kqo1Var = new kqo1();
        zzb = kqo1Var;
        iao1.f(kqo1.class, kqo1Var);
    }

    public static /* synthetic */ void q(kqo1 kqo1Var, sro1 sro1Var) {
        kqo1Var.zzf = sro1Var;
        kqo1Var.zze = 4;
    }

    public static cqo1 r() {
        return (cqo1) zzb.k();
    }

    public static /* synthetic */ void s(kqo1 kqo1Var, nlo1 nlo1Var) {
        kqo1Var.zzf = nlo1Var;
        kqo1Var.zze = 2;
    }

    public static /* synthetic */ void t(kqo1 kqo1Var, gmo1 gmo1Var) {
        kqo1Var.zzf = gmo1Var;
        kqo1Var.zze = 3;
    }

    public static /* synthetic */ void u(kqo1 kqo1Var, dno1 dno1Var) {
        dno1Var.getClass();
        kqo1Var.zzf = dno1Var;
        kqo1Var.zze = 7;
    }

    public static /* synthetic */ void v(kqo1 kqo1Var, doo1 doo1Var) {
        doo1Var.getClass();
        kqo1Var.zzg = doo1Var;
        kqo1Var.zzd |= 1;
    }

    public static /* synthetic */ void w(kqo1 kqo1Var, dro1 dro1Var) {
        kqo1Var.zzf = dro1Var;
        kqo1Var.zze = 8;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", nlo1.class, gmo1.class, sro1.class, tno1.class, "zzh", dno1.class, dro1.class});
        }
        if (i2 == 3) {
            return new kqo1();
        }
        if (i2 == 4) {
            return new cqo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
