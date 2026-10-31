package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pln1 extends rin1 {
    private static final pln1 zzn;
    private int zza;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzm = "";

    static {
        pln1 pln1Var = new pln1();
        zzn = pln1Var;
        rin1.m(pln1.class, pln1Var);
    }

    public static oln1 x() {
        return (oln1) zzn.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zzf = "18.9.3";
    }

    public final /* synthetic */ void B(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzh = str;
    }

    public final /* synthetic */ void C(String str) {
        Objects.requireNonNull(str);
        this.zzi = str;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzj = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzk = z;
    }

    public final /* synthetic */ void F(String str) {
        this.zzl = str;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 2;
        this.zzm = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzg = i - 2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzn, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005ለ\u0000\u0006Ȉ\u0007\u0007\b\u0007\tȈ\nለ\u0001", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new pln1();
        }
        if (i2 == 4) {
            return new oln1(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(pln1.class);
    }

    public final /* synthetic */ void y(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    public final /* synthetic */ void z(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }
}
