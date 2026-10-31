package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cmn1 extends rin1 {
    private static final cmn1 zzn;
    private ain1 zza;
    private String zzd;
    private long zze;
    private ain1 zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;

    static {
        cmn1 cmn1Var = new cmn1();
        zzn = cmn1Var;
        rin1.m(cmn1.class, cmn1Var);
    }

    public cmn1() {
        vhn1 vhn1Var = ain1.b;
        this.zza = vhn1Var;
        this.zzd = "";
        this.zzf = vhn1Var;
        this.zzg = "";
        this.zzh = "";
    }

    public static cmn1 E() {
        return zzn;
    }

    public final ain1 A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final String C() {
        return this.zzh;
    }

    public final boolean D() {
        return this.zzk;
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    public final /* synthetic */ void G() {
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void H(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzf = ain1Var;
    }

    public final /* synthetic */ void I() {
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void J(String str) {
        Objects.requireNonNull(str);
        this.zzg = str;
    }

    public final /* synthetic */ void K() {
        this.zzg = zzn.zzg;
    }

    public final /* synthetic */ void L(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    public final /* synthetic */ void M() {
        this.zzh = zzn.zzh;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzn, "\u0004\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u0007\t\u0007\n\u0004\u000b\u0007", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new cmn1();
        }
        if (i2 == 4) {
            return new bmn1(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(cmn1.class);
    }

    public final ain1 x() {
        return this.zza;
    }

    public final String y() {
        return this.zzd;
    }

    public final long z() {
        return this.zze;
    }
}
