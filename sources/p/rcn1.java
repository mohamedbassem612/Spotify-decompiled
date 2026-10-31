package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rcn1 extends cip1 {
    private static final rcn1 zzg;
    private int zzb;
    private double zzd;
    private int zze;
    private int zzf;

    static {
        rcn1 rcn1Var = new rcn1();
        zzg = rcn1Var;
        cip1.h(rcn1.class, rcn1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", "zze", djx0.Z0, "zzf", bjx0.Z0});
        }
        if (i2 == 3) {
            return new rcn1();
        }
        if (i2 == 4) {
            return new lcn1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
