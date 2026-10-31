package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ocp1 extends cip1 {
    private static final ocp1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        ocp1 ocp1Var = new ocp1();
        zzf = ocp1Var;
        cip1.h(ocp1.class, ocp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            f4x0 f4x0Var = f4x0.Z0;
            return new tjp1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", f4x0Var, "zze", f4x0Var});
        }
        if (i2 == 3) {
            return new ocp1();
        }
        if (i2 == 4) {
            return new a9p1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
