package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q6p1 extends cip1 {
    private static final q6p1 zzg;
    private int zzb;
    private int zzd = 0;
    private Object zze;
    private long zzf;

    static {
        q6p1 q6p1Var = new q6p1();
        zzg = q6p1Var;
        cip1.h(q6p1.class, q6p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zze", "zzd", "zzb", "zzf"});
        }
        if (i2 == 3) {
            return new q6p1();
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
