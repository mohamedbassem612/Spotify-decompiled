package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class apo1 extends iao1 {
    private static final apo1 zzb;
    private int zzd;
    private int zze;

    static {
        apo1 apo1Var = new apo1();
        zzb = apo1Var;
        iao1.f(apo1.class, apo1Var);
    }

    public static roo1 q() {
        return (roo1) zzb.k();
    }

    public static /* synthetic */ void r(apo1 apo1Var, int i) {
        apo1Var.zze = i - 1;
        apo1Var.zzd |= 1;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", c3o1.g});
        }
        if (i2 == 3) {
            return new apo1();
        }
        if (i2 == 4) {
            return new roo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
