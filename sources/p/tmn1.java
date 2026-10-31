package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tmn1 extends rin1 {
    private static final tmn1 zzn;
    private int zza;
    private pmn1 zzk;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzl = "";
    private String zzm = "";

    static {
        tmn1 tmn1Var = new tmn1();
        zzn = tmn1Var;
        rin1.m(tmn1.class, tmn1Var);
    }

    public static smn1 x() {
        return (smn1) zzn.h();
    }

    public final /* synthetic */ void A(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 8;
        this.zzg = "mobile_client/authentication";
    }

    public final /* synthetic */ void C(pmn1 pmn1Var) {
        Objects.requireNonNull(pmn1Var);
        this.zzk = pmn1Var;
        this.zza |= 128;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007\tለ\b\nለ\t", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new tmn1();
        }
        if (i2 == 4) {
            return new smn1(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(tmn1.class);
    }

    public final /* synthetic */ void y(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void z(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zze = str;
    }
}
