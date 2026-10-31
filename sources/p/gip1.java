package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gip1 extends rin1 {
    private static final gip1 zzg;
    private String zza = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        gip1 gip1Var = new gip1();
        zzg = gip1Var;
        rin1.m(gip1.class, gip1Var);
    }

    public static fip1 x() {
        return (fip1) zzg.h();
    }

    public final void A(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            xin1.a();
            throw null;
        }
    }

    public final /* synthetic */ void B(int i) {
        if (i != 1) {
            this.zzf = i - 2;
        } else {
            xin1.a();
            throw null;
        }
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new gip1();
        }
        if (i2 == 4) {
            return new fip1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(gip1.class);
    }

    public final /* synthetic */ void y(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final /* synthetic */ void z(int i) {
        this.zze = i;
    }
}
