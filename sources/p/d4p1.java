package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d4p1 extends cip1 {
    private static final d4p1 zzd;
    private lip1 zzb = rjp1.e;

    static {
        d4p1 d4p1Var = new d4p1();
        zzd = d4p1Var;
        cip1.h(d4p1.class, d4p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new d4p1();
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
