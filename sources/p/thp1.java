package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class thp1 extends rin1 {
    private static final thp1 zzh;
    private int zze;
    private boolean zzf;
    private String zza = "";
    private String zzd = "";
    private String zzg = "";

    static {
        thp1 thp1Var = new thp1();
        zzh = thp1Var;
        rin1.m(thp1.class, thp1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new thp1();
        }
        if (i2 == 4) {
            return new jkn1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(thp1.class);
    }
}
