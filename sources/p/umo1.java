package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class umo1 extends iao1 {
    private static final umo1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        umo1 umo1Var = new umo1();
        zzb = umo1Var;
        iao1.f(umo1.class, umo1Var);
    }

    public static /* synthetic */ void q(umo1 umo1Var, int i) {
        umo1Var.zzd |= 1;
        umo1Var.zze = i;
    }

    public static lmo1 r() {
        return (lmo1) zzb.k();
    }

    public static /* synthetic */ void s(umo1 umo1Var, String str) {
        umo1Var.zzd |= 8;
        umo1Var.zzh = str;
    }

    public static /* synthetic */ void t(umo1 umo1Var, String str) {
        str.getClass();
        umo1Var.zzd |= 2;
        umo1Var.zzf = str;
    }

    public static /* synthetic */ void u(umo1 umo1Var) {
        umo1Var.zzd |= 32;
        umo1Var.zzj = 0;
    }

    public static /* synthetic */ void v(umo1 umo1Var, int i) {
        umo1Var.zzd |= 16;
        umo1Var.zzi = i;
    }

    public static void w(umo1 umo1Var, int i) {
        umo1Var.zzg = lqn1.c(i);
        umo1Var.zzd |= 4;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", c3o1.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new umo1();
        }
        if (i2 == 4) {
            return new lmo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
