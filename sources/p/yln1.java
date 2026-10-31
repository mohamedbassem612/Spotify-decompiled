package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yln1 extends rin1 {
    private static final yln1 zzs;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private vin1 zzj = bjn1.e;
    private ain1 zzk = ain1.b;
    private cmn1 zzl;
    private wln1 zzm;
    private fmn1 zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    static {
        yln1 yln1Var = new yln1();
        zzs = yln1Var;
        rin1.m(yln1.class, yln1Var);
    }

    public static yln1 I() {
        return zzs;
    }

    public final cmn1 A() {
        cmn1 cmn1Var = this.zzl;
        return cmn1Var == null ? cmn1.E() : cmn1Var;
    }

    public final boolean B() {
        return (this.zza & 256) != 0;
    }

    public final wln1 C() {
        wln1 wln1Var = this.zzm;
        return wln1Var == null ? wln1.y() : wln1Var;
    }

    public final fmn1 D() {
        fmn1 fmn1Var = this.zzn;
        return fmn1Var == null ? fmn1.A() : fmn1Var;
    }

    public final boolean E() {
        return this.zzo;
    }

    public final long F() {
        return this.zzp;
    }

    public final boolean G() {
        return this.zzq;
    }

    public final boolean H() {
        return this.zzr;
    }

    public final /* synthetic */ void J(cmn1 cmn1Var) {
        this.zzl = cmn1Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void K(wln1 wln1Var) {
        this.zzm = wln1Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void L(fmn1 fmn1Var) {
        Objects.requireNonNull(fmn1Var);
        this.zzn = fmn1Var;
        this.zza |= 512;
    }

    public final /* synthetic */ void M() {
        this.zzn = null;
        this.zza &= -513;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzs, "\u0004\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\u000bဉ\u0007\fဉ\b\rဉ\t\u000eဇ\n\u000fဂ\u000b\u0010ဇ\f\u0011ဇ\r", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new yln1();
        }
        if (i2 == 4) {
            return new xln1(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(yln1.class);
    }

    public final String x() {
        return this.zzf;
    }

    public final String y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zza & 128) != 0;
    }
}
