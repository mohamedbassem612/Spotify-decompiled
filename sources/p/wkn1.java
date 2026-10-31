package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wkn1 extends rin1 {
    private static final wkn1 zzi;
    private String zza = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        wkn1 wkn1Var = new wkn1();
        zzi = wkn1Var;
        rin1.m(wkn1.class, wkn1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzi, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new wkn1();
        }
        if (i2 == 4) {
            return new jkn1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(wkn1.class);
    }
}
