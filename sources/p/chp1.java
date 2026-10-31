package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class chp1 extends rin1 {
    private static final chp1 zzf;
    private int zza;
    private int zzd;
    private int zze;

    static {
        chp1 chp1Var = new chp1();
        zzf = chp1Var;
        rin1.m(chp1.class, chp1Var);
    }

    public static bhp1 y() {
        return (bhp1) zzf.h();
    }

    public static chp1 z() {
        return zzf;
    }

    public final /* synthetic */ void A(nhp1 nhp1Var) {
        this.zza = nhp1Var.zza();
    }

    public final int B() {
        int i = this.zzd;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int C() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void D(int i) {
        this.zzd = i - 2;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i - 2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new chp1();
        }
        if (i2 == 4) {
            return new bhp1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(chp1.class);
    }

    public final nhp1 x() {
        nhp1 nhp1VarA = nhp1.a(this.zza);
        return nhp1VarA == null ? nhp1.UNRECOGNIZED : nhp1VarA;
    }
}
