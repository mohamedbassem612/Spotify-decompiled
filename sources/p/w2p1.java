package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w2p1 extends cip1 {
    private static final w2p1 zzi;
    private int zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private double zzg;
    private double zzh;

    static {
        w2p1 w2p1Var = new w2p1();
        zzi = w2p1Var;
        cip1.h(w2p1.class, w2p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new w2p1();
        }
        if (i2 == 4) {
            return new lcn1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
