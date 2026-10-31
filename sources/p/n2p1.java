package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n2p1 extends cip1 {
    private static final n2p1 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private jip1 zzf = eip1.e;

    static {
        n2p1 n2p1Var = new n2p1();
        zzg = n2p1Var;
        cip1.h(n2p1.class, n2p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", wdx0.a1});
        }
        if (i2 == 3) {
            return new n2p1();
        }
        if (i2 == 4) {
            return new lcn1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
