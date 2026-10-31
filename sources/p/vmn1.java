package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vmn1 extends rin1 {
    private static final vmn1 zzf;
    private int zza;
    private String zzd = "";
    private String zze = "";

    static {
        vmn1 vmn1Var = new vmn1();
        zzf = vmn1Var;
        rin1.m(vmn1.class, vmn1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new vmn1();
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
        return rin1.k(vmn1.class);
    }

    public final String x() {
        return this.zzd;
    }

    public final String y() {
        return this.zze;
    }
}
