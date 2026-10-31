package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class emn1 extends rin1 {
    private static final emn1 zzg;
    private int zza;
    private inn1 zze;
    private String zzd = "";
    private ain1 zzf = ain1.b;

    static {
        emn1 emn1Var = new emn1();
        zzg = emn1Var;
        rin1.m(emn1.class, emn1Var);
    }

    public static dmn1 x() {
        return (dmn1) zzg.h();
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new emn1();
        }
        if (i2 == 4) {
            return new dmn1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(emn1.class);
    }

    public final /* synthetic */ void y(inn1 inn1Var) {
        this.zze = inn1Var;
        this.zza |= 2;
    }

    public final /* synthetic */ void z(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zza |= 4;
        this.zzf = ain1Var;
    }
}
