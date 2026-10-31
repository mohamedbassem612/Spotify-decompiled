package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class noo1 extends iao1 {
    private static final noo1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        noo1 noo1Var = new noo1();
        zzb = noo1Var;
        iao1.f(noo1.class, noo1Var);
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new noo1();
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
