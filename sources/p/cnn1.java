package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cnn1 extends rin1 {
    private static final cnn1 zze;
    private ain1 zza;
    private ain1 zzd;

    static {
        cnn1 cnn1Var = new cnn1();
        zze = cnn1Var;
        rin1.m(cnn1.class, cnn1Var);
    }

    public cnn1() {
        vhn1 vhn1Var = ain1.b;
        this.zza = vhn1Var;
        this.zzd = vhn1Var;
    }

    public static cnn1 A() {
        return zze;
    }

    public static bnn1 z() {
        return (bnn1) zze.h();
    }

    public final /* synthetic */ void B(ain1 ain1Var) {
        this.zza = ain1Var;
    }

    public final /* synthetic */ void C(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzd = ain1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\n", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new cnn1();
        }
        if (i2 == 4) {
            return new bnn1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(cnn1.class);
    }

    public final ain1 x() {
        return this.zza;
    }

    public final ain1 y() {
        return this.zzd;
    }
}
