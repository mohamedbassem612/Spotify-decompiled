package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gnn1 extends rin1 {
    private static final gnn1 zzl;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private ain1 zzf;
    private ain1 zzg;
    private ain1 zzh;
    private uin1 zzi;
    private int zzj;
    private int zzk;

    static {
        gnn1 gnn1Var = new gnn1();
        zzl = gnn1Var;
        rin1.m(gnn1.class, gnn1Var);
    }

    public gnn1() {
        vhn1 vhn1Var = ain1.b;
        this.zzf = vhn1Var;
        this.zzg = vhn1Var;
        this.zzh = vhn1Var;
        this.zzi = sin1.e;
    }

    public static enn1 D() {
        return (enn1) zzl.h();
    }

    public final String A() {
        return this.zze;
    }

    public final boolean B() {
        return (this.zza & 4) != 0;
    }

    public final ain1 C() {
        return this.zzf;
    }

    public final /* synthetic */ void E() {
        this.zza &= -2;
        this.zzd = zzl.zzd;
    }

    public final /* synthetic */ void F() {
        this.zza &= -3;
        this.zze = zzl.zze;
    }

    public final /* synthetic */ void G(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zza |= 4;
        this.zzf = ain1Var;
    }

    public final /* synthetic */ void H(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zza |= 8;
        this.zzg = ain1Var;
    }

    public final /* synthetic */ void I(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zza |= 16;
        this.zzh = ain1Var;
    }

    public final /* synthetic */ void J(int i) {
        this.zzj = i - 1;
        this.zza |= 32;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0005\u0005င\u0006\u0006ည\u0002\u0007ည\u0003\bည\u0004", new Object[]{"zza", "zzd", "zze", "zzi", "zzj", fnn1.a, "zzk", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new gnn1();
        }
        if (i2 == 4) {
            return new enn1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(gnn1.class);
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final String y() {
        return this.zzd;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
