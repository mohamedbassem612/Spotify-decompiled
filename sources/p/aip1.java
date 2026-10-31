package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aip1 extends rin1 {
    private static final aip1 zzh;
    private int zza;
    private qhp1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        aip1 aip1Var = new aip1();
        zzh = aip1Var;
        rin1.m(aip1.class, aip1Var);
    }

    public static zhp1 z() {
        return (zhp1) zzh.h();
    }

    public final /* synthetic */ void A(qhp1 qhp1Var) {
        this.zzd = qhp1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void B(int i) {
        this.zzf = i;
    }

    public final int C() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int D() {
        int i = this.zzg;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = 5;
                if (i != 3) {
                    if (i != 4) {
                        i2 = i != 5 ? 0 : 7;
                    } else {
                        i2 = 6;
                    }
                }
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final void E(int i) {
        if (i != 1) {
            this.zze = i - 2;
        } else {
            xin1.a();
            throw null;
        }
    }

    public final /* synthetic */ void F(int i) {
        this.zzg = i - 2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzh, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new aip1();
        }
        if (i2 == 4) {
            return new zhp1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(aip1.class);
    }

    public final qhp1 x() {
        qhp1 qhp1Var = this.zzd;
        return qhp1Var == null ? qhp1.A() : qhp1Var;
    }

    public final int y() {
        return this.zzf;
    }
}
