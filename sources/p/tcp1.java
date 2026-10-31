package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tcp1 extends cip1 {
    private static final tcp1 zzg;
    private int zzb;
    private long zzd;
    private long zze;
    private lip1 zzf = rjp1.e;

    static {
        tcp1 tcp1Var = new tcp1();
        zzg = tcp1Var;
        cip1.h(tcp1.class, tcp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", xcp1.class});
        }
        if (i2 == 3) {
            return new tcp1();
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
