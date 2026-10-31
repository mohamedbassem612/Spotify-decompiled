package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sip1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final sip1 zzm;
    private int zzd;
    private int zze;
    private vip1 zzf;
    private ain1 zzg;
    private ain1 zzh;
    private ain1 zzi;
    private ain1 zzj;
    private ain1 zzk;
    private ain1 zzl;

    static {
        sip1 sip1Var = new sip1();
        zzm = sip1Var;
        rin1.m(sip1.class, sip1Var);
    }

    public sip1() {
        vhn1 vhn1Var = ain1.b;
        this.zzg = vhn1Var;
        this.zzh = vhn1Var;
        this.zzi = vhn1Var;
        this.zzj = vhn1Var;
        this.zzk = vhn1Var;
        this.zzl = vhn1Var;
    }

    public static sip1 F(ain1 ain1Var, hin1 hin1Var) {
        return (sip1) rin1.o(zzm, ain1Var, hin1Var);
    }

    public static rip1 G() {
        return (rip1) zzm.h();
    }

    public final ain1 A() {
        return this.zzh;
    }

    public final ain1 B() {
        return this.zzi;
    }

    public final ain1 C() {
        return this.zzj;
    }

    public final ain1 D() {
        return this.zzk;
    }

    public final ain1 E() {
        return this.zzl;
    }

    public final /* synthetic */ void H() {
        this.zze = 0;
    }

    public final /* synthetic */ void I(vip1 vip1Var) {
        this.zzf = vip1Var;
        this.zzd |= 1;
    }

    public final /* synthetic */ void J(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzg = ain1Var;
    }

    public final /* synthetic */ void K(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzh = ain1Var;
    }

    public final /* synthetic */ void L(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzi = vhn1Var;
    }

    public final /* synthetic */ void M(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzj = vhn1Var;
    }

    public final /* synthetic */ void N(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzk = vhn1Var;
    }

    public final /* synthetic */ void O(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzl = vhn1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzm, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new sip1();
        }
        if (i2 == 4) {
            return new rip1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(sip1.class);
    }

    public final int x() {
        return this.zze;
    }

    public final vip1 y() {
        vip1 vip1Var = this.zzf;
        return vip1Var == null ? vip1.D() : vip1Var;
    }

    public final ain1 z() {
        return this.zzg;
    }
}
