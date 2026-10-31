package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jhp1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final jhp1 zzh;
    private int zzd;
    private int zze;
    private ain1 zzf = ain1.b;
    private mhp1 zzg;

    static {
        jhp1 jhp1Var = new jhp1();
        zzh = jhp1Var;
        rin1.m(jhp1.class, jhp1Var);
    }

    public static jhp1 A(ain1 ain1Var, hin1 hin1Var) {
        return (jhp1) rin1.o(zzh, ain1Var, hin1Var);
    }

    public static ihp1 B() {
        return (ihp1) zzh.h();
    }

    public final /* synthetic */ void C(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzf = ain1Var;
    }

    public final /* synthetic */ void D(mhp1 mhp1Var) {
        this.zzg = mhp1Var;
        this.zzd |= 1;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new jhp1();
        }
        if (i2 == 4) {
            return new ihp1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(jhp1.class);
    }

    public final int x() {
        return this.zze;
    }

    public final ain1 y() {
        return this.zzf;
    }

    public final mhp1 z() {
        mhp1 mhp1Var = this.zzg;
        return mhp1Var == null ? mhp1.B() : mhp1Var;
    }
}
