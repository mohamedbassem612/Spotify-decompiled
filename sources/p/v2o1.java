package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v2o1 extends iao1 {
    private static final v2o1 zzb;
    private int zzd;
    private String zze = "";

    static {
        v2o1 v2o1Var = new v2o1();
        zzb = v2o1Var;
        iao1.f(v2o1.class, v2o1Var);
    }

    public static q2o1 q() {
        return (q2o1) zzb.k();
    }

    public static /* synthetic */ void r(v2o1 v2o1Var, String str) {
        v2o1Var.zzd |= 1;
        v2o1Var.zze = str;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new v2o1();
        }
        if (i2 == 4) {
            return new q2o1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
