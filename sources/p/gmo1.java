package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gmo1 extends iao1 {
    private static final gmo1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        gmo1 gmo1Var = new gmo1();
        zzb = gmo1Var;
        iao1.f(gmo1.class, gmo1Var);
    }

    public static /* synthetic */ void q(gmo1 gmo1Var, int i) {
        gmo1Var.zzg = i - 1;
        gmo1Var.zzd |= 1;
    }

    public static qlo1 r() {
        return (qlo1) zzb.k();
    }

    public static void t(gmo1 gmo1Var, jno1 jno1Var) {
        gmo1Var.zzh = jno1Var.a;
        gmo1Var.zzd |= 2;
    }

    public static /* synthetic */ void u(gmo1 gmo1Var, apo1 apo1Var) {
        gmo1Var.zzf = apo1Var;
        gmo1Var.zze = 2;
    }

    public static /* synthetic */ void v(gmo1 gmo1Var, ypo1 ypo1Var) {
        gmo1Var.zzf = ypo1Var;
        gmo1Var.zze = 4;
    }

    public static /* synthetic */ void w(gmo1 gmo1Var, bso1 bso1Var) {
        gmo1Var.zzf = bso1Var;
        gmo1Var.zze = 3;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", c3o1.c, apo1.class, bso1.class, ypo1.class, "zzh", c3o1.e});
        }
        if (i2 == 3) {
            return new gmo1();
        }
        if (i2 == 4) {
            return new qlo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final ypo1 s() {
        return this.zze == 4 ? (ypo1) this.zzf : ypo1.q();
    }
}
