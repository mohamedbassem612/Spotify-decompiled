package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fmn1 extends rin1 {
    private static final fmn1 zzg;
    private int zza;
    private ain1 zzd;
    private ain1 zze;
    private boolean zzf;

    static {
        fmn1 fmn1Var = new fmn1();
        zzg = fmn1Var;
        rin1.m(fmn1.class, fmn1Var);
    }

    public fmn1() {
        vhn1 vhn1Var = ain1.b;
        this.zzd = vhn1Var;
        this.zze = vhn1Var;
    }

    public static fmn1 A() {
        return zzg;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003ဇ\u0000", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new fmn1();
        }
        if (i2 == 4) {
            return new jkn1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(fmn1.class);
    }

    public final ain1 x() {
        return this.zzd;
    }

    public final ain1 y() {
        return this.zze;
    }

    public final boolean z() {
        return this.zzf;
    }
}
