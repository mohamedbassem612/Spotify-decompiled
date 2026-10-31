package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gln1 extends rin1 {
    private static final gln1 zzj;
    private int zza;
    private wkn1 zze;
    private skn1 zzf;
    private xkn1 zzg;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        gln1 gln1Var = new gln1();
        zzj = gln1Var;
        rin1.m(gln1.class, gln1Var);
    }

    public static fln1 x() {
        return (fln1) zzj.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zzh = str;
    }

    public final /* synthetic */ void B(String str) {
        this.zzi = str;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzj, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new gln1();
        }
        if (i2 == 4) {
            return new fln1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(gln1.class);
    }

    public final /* synthetic */ void y(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    public final /* synthetic */ void z(skn1 skn1Var) {
        this.zzf = skn1Var;
        this.zza |= 2;
    }
}
