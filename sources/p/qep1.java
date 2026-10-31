package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qep1 extends cip1 {
    private static final qep1 zzf;
    private int zzb;
    private int zzd;
    private nap1 zze;

    static {
        qep1 qep1Var = new qep1();
        zzf = qep1Var;
        cip1.h(qep1.class, qep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zzd", njx0.a1, "zze"});
        }
        if (i2 == 3) {
            return new qep1();
        }
        if (i2 == 4) {
            return new sdp1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
