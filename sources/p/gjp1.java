package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gjp1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final gjp1 zzi;
    private int zzd;
    private int zze;
    private zip1 zzf;
    private ain1 zzg;
    private ain1 zzh;

    static {
        gjp1 gjp1Var = new gjp1();
        zzi = gjp1Var;
        rin1.m(gjp1.class, gjp1Var);
    }

    public gjp1() {
        vhn1 vhn1Var = ain1.b;
        this.zzg = vhn1Var;
        this.zzh = vhn1Var;
    }

    public static gjp1 B(ain1 ain1Var, hin1 hin1Var) {
        return (gjp1) rin1.o(zzi, ain1Var, hin1Var);
    }

    public static fjp1 C() {
        return (fjp1) zzi.h();
    }

    public static gjp1 D() {
        return zzi;
    }

    public final ain1 A() {
        return this.zzh;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = 0;
    }

    public final /* synthetic */ void F(zip1 zip1Var) {
        this.zzf = zip1Var;
        this.zzd |= 1;
    }

    public final /* synthetic */ void G(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzg = vhn1Var;
    }

    public final /* synthetic */ void H(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzh = ain1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new gjp1();
        }
        if (i2 == 4) {
            return new fjp1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(gjp1.class);
    }

    public final int x() {
        return this.zze;
    }

    public final zip1 y() {
        zip1 zip1Var = this.zzf;
        return zip1Var == null ? zip1.B() : zip1Var;
    }

    public final ain1 z() {
        return this.zzg;
    }
}
