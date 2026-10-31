package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m8p1 extends cip1 {
    private static final m8p1 zzi;
    private int zzb;
    private Object zze;
    private int zzf;
    private int zzd = 0;
    private String zzg = "";
    private lip1 zzh = rjp1.e;

    static {
        m8p1 m8p1Var = new m8p1();
        zzi = m8p1Var;
        cip1.h(m8p1.class, m8p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzi, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"zze", "zzd", "zzb", "zzf", y1x0.a1, "zzg", "zzh", nap1.class, tep1.class, qep1.class});
        }
        if (i2 == 3) {
            return new m8p1();
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
