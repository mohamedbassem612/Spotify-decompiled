package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class onn1 extends rin1 {
    private static final onn1 zzf;
    private String zza = "";
    private String zzd = "";
    private String zze = "";

    static {
        onn1 onn1Var = new onn1();
        zzf = onn1Var;
        rin1.m(onn1.class, onn1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new onn1();
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
        return rin1.k(onn1.class);
    }
}
