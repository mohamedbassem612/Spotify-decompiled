package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ypo1 extends iao1 {
    private static final ypo1 zzb;
    private int zzd;
    private ebo1 zze = kgo1.e;
    private String zzf = "";
    private boolean zzg;

    static {
        ypo1 ypo1Var = new ypo1();
        zzb = ypo1Var;
        iao1.f(ypo1.class, ypo1Var);
    }

    public static ypo1 q() {
        return zzb;
    }

    public static /* synthetic */ void r(ypo1 ypo1Var, boolean z) {
        ypo1Var.zzd |= 2;
        ypo1Var.zzg = z;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", tpo1.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ypo1();
        }
        if (i2 == 4) {
            return new dpo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
