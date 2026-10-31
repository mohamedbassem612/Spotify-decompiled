package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class scn1 extends cip1 {
    private static final scn1 zzg;
    private lip1 zzb;
    private lip1 zzd;
    private lip1 zze;
    private lip1 zzf;

    static {
        scn1 scn1Var = new scn1();
        zzg = scn1Var;
        cip1.h(scn1.class, scn1Var);
    }

    public scn1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzb = rjp1Var;
        this.zzd = rjp1Var;
        this.zze = rjp1Var;
        this.zzf = rjp1Var;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzb", rcn1.class, "zzd", ocn1.class, "zze", rcn1.class, "zzf", ocn1.class});
        }
        if (i2 == 3) {
            return new scn1();
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
