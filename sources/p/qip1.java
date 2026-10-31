package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qip1 extends rin1 {
    private static final qip1 zzd;
    private int zza;

    static {
        qip1 qip1Var = new qip1();
        zzd = qip1Var;
        rin1.m(qip1.class, qip1Var);
    }

    public static pip1 y() {
        return (pip1) zzd.h();
    }

    public static qip1 z() {
        return zzd;
    }

    public final /* synthetic */ void A(nhp1 nhp1Var) {
        this.zza = nhp1Var.zza();
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzd, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (i2 == 3) {
            return new qip1();
        }
        if (i2 == 4) {
            return new pip1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(qip1.class);
    }

    public final nhp1 x() {
        nhp1 nhp1VarA = nhp1.a(this.zza);
        return nhp1VarA == null ? nhp1.UNRECOGNIZED : nhp1VarA;
    }
}
