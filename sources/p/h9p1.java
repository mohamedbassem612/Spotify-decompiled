package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h9p1 extends cip1 {
    private static final h9p1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        h9p1 h9p1Var = new h9p1();
        zzf = h9p1Var;
        cip1.h(h9p1.class, h9p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", jcx0.a1, "zze"});
        }
        if (i2 == 3) {
            return new h9p1();
        }
        if (i2 == 4) {
            return new a9p1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
