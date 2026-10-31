package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dnn1 extends rin1 {
    private static final dnn1 zzk;
    private int zza;
    private long zzd;
    private long zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        dnn1 dnn1Var = new dnn1();
        zzk = dnn1Var;
        rin1.m(dnn1.class, dnn1Var);
    }

    public static dnn1 A(byte[] bArr) {
        return (dnn1) rin1.p(zzk, bArr);
    }

    public final int B() {
        int i = this.zzh;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int C() {
        int i = this.zzi;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int D() {
        int i = this.zzj;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new dnn1();
        }
        if (i2 == 4) {
            return new jkn1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(dnn1.class);
    }

    public final long x() {
        return this.zze;
    }

    public final int y() {
        return this.zzf;
    }

    public final long z() {
        return this.zzg;
    }
}
