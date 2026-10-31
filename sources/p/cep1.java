package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cep1 extends cip1 {
    private static final cep1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private lip1 zzf;
    private lip1 zzg;
    private boolean zzh;

    static {
        cep1 cep1Var = new cep1();
        zzi = cep1Var;
        cip1.h(cep1.class, cep1Var);
    }

    public cep1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzf = rjp1Var;
        this.zzg = rjp1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005ဇ\u0002", new Object[]{"zzb", "zzd", m9x0.b1, "zze", "zzf", qdp1.class, "zzg", aep1.class, "zzh"});
        }
        if (i2 == 3) {
            return new cep1();
        }
        if (i2 == 4) {
            return new sdp1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
