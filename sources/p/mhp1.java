package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mhp1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final mhp1 zzf;
    private int zzd;
    private ain1 zze = ain1.b;

    static {
        mhp1 mhp1Var = new mhp1();
        zzf = mhp1Var;
        rin1.m(mhp1.class, mhp1Var);
    }

    public static lhp1 A() {
        return (lhp1) zzf.h();
    }

    public static mhp1 B() {
        return zzf;
    }

    public static mhp1 z(ain1 ain1Var, hin1 hin1Var) {
        return (mhp1) rin1.o(zzf, ain1Var, hin1Var);
    }

    public final /* synthetic */ void C(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zze = ain1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new mhp1();
        }
        if (i2 == 4) {
            return new lhp1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(mhp1.class);
    }

    public final int x() {
        return this.zzd;
    }

    public final ain1 y() {
        return this.zze;
    }
}
