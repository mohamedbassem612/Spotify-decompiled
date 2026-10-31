package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zip1 extends rin1 {
    private static final zip1 zzf;
    private int zza;
    private int zzd;
    private int zze;

    static {
        zip1 zip1Var = new zip1();
        zzf = zip1Var;
        rin1.m(zip1.class, zip1Var);
    }

    public static xip1 A() {
        return (xip1) zzf.h();
    }

    public static zip1 B() {
        return zzf;
    }

    public final /* synthetic */ void C(nhp1 nhp1Var) {
        this.zza = nhp1Var.zza();
    }

    public final /* synthetic */ void D(nhp1 nhp1Var) {
        this.zzd = nhp1Var.zza();
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new zip1();
        }
        if (i2 == 4) {
            return new xip1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(zip1.class);
    }

    public final nhp1 x() {
        nhp1 nhp1VarA = nhp1.a(this.zza);
        return nhp1VarA == null ? nhp1.UNRECOGNIZED : nhp1VarA;
    }

    public final nhp1 y() {
        nhp1 nhp1VarA = nhp1.a(this.zzd);
        return nhp1VarA == null ? nhp1.UNRECOGNIZED : nhp1VarA;
    }

    public final int z() {
        return this.zze;
    }
}
