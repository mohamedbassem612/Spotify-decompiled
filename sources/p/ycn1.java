package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ycn1 extends cip1 {
    private static final ycn1 zzd;
    private lip1 zzb = rjp1.e;

    static {
        ycn1 ycn1Var = new ycn1();
        zzd = ycn1Var;
        cip1.h(ycn1.class, ycn1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zcn1.class});
        }
        if (i2 == 3) {
            return new ycn1();
        }
        if (i2 == 4) {
            return new lcn1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
