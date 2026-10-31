package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qnn1 extends rin1 {
    private static final qnn1 zzk;
    private int zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private onn1 zzh;
    private int zzi;
    private vnn1 zzj;

    static {
        qnn1 qnn1Var = new qnn1();
        zzk = qnn1Var;
        rin1.m(qnn1.class, qnn1Var);
    }

    public static pnn1 x() {
        return (pnn1) zzk.h();
    }

    public final /* synthetic */ void A(int i) {
        this.zzf = i - 2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzk, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new qnn1();
        }
        if (i2 == 4) {
            return new pnn1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(qnn1.class);
    }

    public final /* synthetic */ void y(int i) {
        this.zzi = i;
    }

    public final /* synthetic */ void z(int i) {
        this.zzd = i - 2;
    }
}
