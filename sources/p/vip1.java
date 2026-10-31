package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vip1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final vip1 zzi;
    private int zzd;
    private int zze;
    private qip1 zzf;
    private ain1 zzg;
    private ain1 zzh;

    static {
        vip1 vip1Var = new vip1();
        zzi = vip1Var;
        rin1.m(vip1.class, vip1Var);
    }

    public vip1() {
        vhn1 vhn1Var = ain1.b;
        this.zzg = vhn1Var;
        this.zzh = vhn1Var;
    }

    public static vip1 B(ain1 ain1Var, hin1 hin1Var) {
        return (vip1) rin1.o(zzi, ain1Var, hin1Var);
    }

    public static uip1 C() {
        return (uip1) zzi.h();
    }

    public static vip1 D() {
        return zzi;
    }

    public final ain1 A() {
        return this.zzh;
    }

    public final /* synthetic */ void E(qip1 qip1Var) {
        this.zzf = qip1Var;
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
            return new vip1();
        }
        if (i2 == 4) {
            return new uip1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(vip1.class);
    }

    public final int x() {
        return this.zze;
    }

    public final qip1 y() {
        qip1 qip1Var = this.zzf;
        return qip1Var == null ? qip1.z() : qip1Var;
    }

    public final ain1 z() {
        return this.zzg;
    }
}
