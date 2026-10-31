package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xmn1 extends rin1 {
    private static final xmn1 zzg;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private pmn1 zzf;

    static {
        xmn1 xmn1Var = new xmn1();
        zzg = xmn1Var;
        rin1.m(xmn1.class, xmn1Var);
    }

    public static wmn1 x() {
        return (wmn1) zzg.h();
    }

    public final /* synthetic */ void A(pmn1 pmn1Var) {
        this.zzf = pmn1Var;
        this.zza |= 4;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzg, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ለ\u0000\u0003ለ\u0001\u0004ဉ\u0002", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new xmn1();
        }
        if (i2 == 4) {
            return new wmn1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(xmn1.class);
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
