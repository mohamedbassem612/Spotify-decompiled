package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rap1 extends cip1 {
    private static final rap1 zzg;
    private int zzb;
    private long zzd;
    private kip1 zze;
    private kip1 zzf;

    static {
        rap1 rap1Var = new rap1();
        zzg = rap1Var;
        cip1.h(rap1.class, rap1Var);
    }

    public rap1() {
        yip1 yip1Var = yip1.e;
        this.zze = yip1Var;
        this.zzf = yip1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new rap1();
        }
        if (i2 == 4) {
            return new a9p1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
