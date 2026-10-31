package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sro1 extends iao1 {
    private static final sro1 zzb;
    private int zzd;
    private int zze;

    static {
        sro1 sro1Var = new sro1();
        zzb = sro1Var;
        iao1.f(sro1.class, sro1Var);
    }

    public static sro1 q() {
        return zzb;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", c3o1.i});
        }
        if (i2 == 3) {
            return new sro1();
        }
        if (i2 == 4) {
            return new ymo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
