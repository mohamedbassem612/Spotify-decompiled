package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xkn1 extends rin1 {
    private static final xkn1 zze;
    private String zza = "";
    private String zzd = "";

    static {
        xkn1 xkn1Var = new xkn1();
        zze = xkn1Var;
        rin1.m(xkn1.class, xkn1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new xkn1();
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
        return rin1.k(xkn1.class);
    }
}
