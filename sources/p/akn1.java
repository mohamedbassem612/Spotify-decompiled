package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class akn1 extends rin1 {
    private static final akn1 zze;
    private long zza;
    private int zzd;

    static {
        akn1 akn1Var = new akn1();
        zze = akn1Var;
        rin1.m(akn1.class, akn1Var);
    }

    public static zjn1 z() {
        return (zjn1) zze.h();
    }

    public final /* synthetic */ void A(long j) {
        this.zza = j;
    }

    public final /* synthetic */ void B(int i) {
        this.zzd = i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new akn1();
        }
        if (i2 == 4) {
            return new zjn1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(akn1.class);
    }

    public final long x() {
        return this.zza;
    }

    public final int y() {
        return this.zzd;
    }
}
