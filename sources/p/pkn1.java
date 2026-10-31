package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pkn1 extends rin1 {
    private static final pkn1 zzf;
    private int zza;
    private gin1 zzd;
    private int zze;

    static {
        pkn1 pkn1Var = new pkn1();
        zzf = pkn1Var;
        rin1.m(pkn1.class, pkn1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new pkn1();
        }
        if (i2 == 4) {
            return new jkn1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(pkn1.class);
    }
}
