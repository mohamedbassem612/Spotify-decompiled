package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d6p1 extends cip1 {
    private static final d6p1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        d6p1 d6p1Var = new d6p1();
        zzf = d6p1Var;
        cip1.h(d6p1.class, d6p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", hcx0.b1, "zze"});
        }
        if (i2 == 3) {
            return new d6p1();
        }
        if (i2 == 4) {
            return new lcn1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
