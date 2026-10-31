package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ymn1 extends rin1 {
    private static final ymn1 zzf;
    private int zza;
    private String zzd = "";
    private ain1 zze = ain1.b;

    static {
        ymn1 ymn1Var = new ymn1();
        zzf = ymn1Var;
        rin1.m(ymn1.class, ymn1Var);
    }

    public static ymn1 z() {
        return zzf;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ည\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new ymn1();
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
        return rin1.k(ymn1.class);
    }

    public final String x() {
        return this.zzd;
    }

    public final ain1 y() {
        return this.zze;
    }
}
