package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l9p1 extends cip1 {
    private static final l9p1 zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        l9p1 l9p1Var = new l9p1();
        zzh = l9p1Var;
        cip1.h(l9p1.class, l9p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", y1x0.Z0, "zze", "zzf", mgx0.a1});
        }
        if (i2 == 3) {
            return new l9p1();
        }
        if (i2 == 4) {
            return new a9p1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        this.zzg = cip1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
