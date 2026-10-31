package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qln1 extends rin1 {
    private static final qln1 zze;
    private int zza;
    private inn1 zzd;

    static {
        qln1 qln1Var = new qln1();
        zze = qln1Var;
        rin1.m(qln1.class, qln1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new qln1();
        }
        if (i2 == 4) {
            return new jkn1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(qln1.class);
    }
}
