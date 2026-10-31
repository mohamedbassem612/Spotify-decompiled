package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ykn1 extends rin1 {
    private static final ykn1 zzj;
    private int zza;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzd = "";
    private String zzf = "";
    private String zzh = "";

    static {
        ykn1 ykn1Var = new ykn1();
        zzj = ykn1Var;
        rin1.m(ykn1.class, ykn1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzj, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new ykn1();
        }
        if (i2 == 4) {
            return new jkn1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(ykn1.class);
    }
}
