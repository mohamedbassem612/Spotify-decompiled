package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ehp1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final ehp1 zzh;
    private int zzd;
    private int zze;
    private hhp1 zzf;
    private ain1 zzg = ain1.b;

    static {
        ehp1 ehp1Var = new ehp1();
        zzh = ehp1Var;
        rin1.m(ehp1.class, ehp1Var);
    }

    public static ehp1 A(ain1 ain1Var, hin1 hin1Var) {
        return (ehp1) rin1.o(zzh, ain1Var, hin1Var);
    }

    public static dhp1 B() {
        return (dhp1) zzh.h();
    }

    public final /* synthetic */ void C(hhp1 hhp1Var) {
        this.zzf = hhp1Var;
        this.zzd |= 1;
    }

    public final /* synthetic */ void D(vhn1 vhn1Var) {
        Objects.requireNonNull(vhn1Var);
        this.zzg = vhn1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ehp1();
        }
        if (i2 == 4) {
            return new dhp1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(ehp1.class);
    }

    public final int x() {
        return this.zze;
    }

    public final hhp1 y() {
        hhp1 hhp1Var = this.zzf;
        return hhp1Var == null ? hhp1.D() : hhp1Var;
    }

    public final ain1 z() {
        return this.zzg;
    }
}
