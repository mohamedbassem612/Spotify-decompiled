package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qhp1 extends rin1 {
    private static final qhp1 zzf;
    private String zza = "";
    private ain1 zzd = ain1.b;
    private int zze;

    static {
        qhp1 qhp1Var = new qhp1();
        zzf = qhp1Var;
        rin1.m(qhp1.class, qhp1Var);
    }

    public static qhp1 A() {
        return zzf;
    }

    public static php1 z() {
        return (php1) zzf.h();
    }

    public final /* synthetic */ void B(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final /* synthetic */ void C(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzd = ain1Var;
    }

    public final int D() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i - 2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new qhp1();
        }
        if (i2 == 4) {
            return new php1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(qhp1.class);
    }

    public final String x() {
        return this.zza;
    }

    public final ain1 y() {
        return this.zzd;
    }
}
