package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hhp1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final hhp1 zzi;
    private int zzd;
    private int zze;
    private chp1 zzf;
    private ain1 zzg;
    private ain1 zzh;

    static {
        hhp1 hhp1Var = new hhp1();
        zzi = hhp1Var;
        rin1.m(hhp1.class, hhp1Var);
    }

    public hhp1() {
        vhn1 vhn1Var = ain1.b;
        this.zzg = vhn1Var;
        this.zzh = vhn1Var;
    }

    public static hhp1 B(ain1 ain1Var, hin1 hin1Var) {
        return (hhp1) rin1.o(zzi, ain1Var, hin1Var);
    }

    public static ghp1 C() {
        return (ghp1) zzi.h();
    }

    public static hhp1 D() {
        return zzi;
    }

    public final ain1 A() {
        return this.zzh;
    }

    public final /* synthetic */ void E(chp1 chp1Var) {
        this.zzf = chp1Var;
        this.zzd |= 1;
    }

    public final /* synthetic */ void F(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzg = vhn1Var;
    }

    public final /* synthetic */ void G(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzh = vhn1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new hhp1();
        }
        if (i2 == 4) {
            return new ghp1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(hhp1.class);
    }

    public final int x() {
        return this.zze;
    }

    public final chp1 y() {
        chp1 chp1Var = this.zzf;
        return chp1Var == null ? chp1.z() : chp1Var;
    }

    public final ain1 z() {
        return this.zzg;
    }
}
