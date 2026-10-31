package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pep1 extends cip1 {
    private static final pep1 zzf;
    private int zzb;
    private long zzd;
    private boolean zze;

    static {
        pep1 pep1Var = new pep1();
        zzf = pep1Var;
        cip1.h(pep1.class, pep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new pep1();
        }
        if (i2 == 4) {
            return new sdp1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
