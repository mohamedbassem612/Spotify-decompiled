package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gin1 extends rin1 {
    private static final gin1 zze;
    private long zza;
    private int zzd;

    static {
        gin1 gin1Var = new gin1();
        zze = gin1Var;
        rin1.m(gin1.class, gin1Var);
    }

    public static gin1 A() {
        return zze;
    }

    public static fin1 z() {
        return (fin1) zze.h();
    }

    public final /* synthetic */ void B(long j) {
        this.zza = j;
    }

    public final /* synthetic */ void C(int i) {
        this.zzd = i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new gin1();
        }
        if (i2 == 4) {
            return new fin1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(gin1.class);
    }

    public final long x() {
        return this.zza;
    }

    public final int y() {
        return this.zzd;
    }
}
