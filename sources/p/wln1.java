package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wln1 extends rin1 {
    private static final wln1 zzd;
    private ain1 zza = ain1.b;

    static {
        wln1 wln1Var = new wln1();
        zzd = wln1Var;
        rin1.m(wln1.class, wln1Var);
    }

    public static wln1 y() {
        return zzd;
    }

    public final /* synthetic */ void A() {
        this.zza = zzd.zza;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zza"});
        }
        if (i2 == 3) {
            return new wln1();
        }
        if (i2 == 4) {
            return new vln1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(wln1.class);
    }

    public final ain1 x() {
        return this.zza;
    }

    public final /* synthetic */ void z(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zza = ain1Var;
    }
}
