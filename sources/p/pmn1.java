package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pmn1 extends rin1 {
    private static final pmn1 zzo;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private rmn1 zzi;
    private emn1 zzj;
    private qmn1 zzk;
    private uln1 zzl;
    private hmn1 zzm;
    private qln1 zzn;

    static {
        pmn1 pmn1Var = new pmn1();
        zzo = pmn1Var;
        rin1.m(pmn1.class, pmn1Var);
    }

    public static kmn1 x() {
        return (kmn1) zzo.h();
    }

    public static pmn1 y() {
        return zzo;
    }

    public final /* synthetic */ void A() {
        this.zza &= -2;
        this.zzd = zzo.zzd;
    }

    public final /* synthetic */ void B(emn1 emn1Var) {
        this.zzj = emn1Var;
        this.zza |= 64;
    }

    public final /* synthetic */ void C(uln1 uln1Var) {
        this.zzl = uln1Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void D(hmn1 hmn1Var) {
        this.zzm = hmn1Var;
        this.zza |= 512;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzo, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new pmn1();
        }
        if (i2 == 4) {
            return new kmn1(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(pmn1.class);
    }

    public final /* synthetic */ void z(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }
}
