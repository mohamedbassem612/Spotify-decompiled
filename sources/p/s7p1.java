package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s7p1 extends cip1 {
    private static final s7p1 zzl;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private yep1 zzg;
    private boolean zzh;
    private long zzj;
    private long zzk;
    private String zzd = "";
    private jip1 zzi = eip1.e;

    static {
        s7p1 s7p1Var = new s7p1();
        zzl = s7p1Var;
        cip1.h(s7p1.class, s7p1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zzd", "zze", "zzg", "zzh", "zzi", pdx0.b1, "zzf", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new s7p1();
        }
        if (i2 == 4) {
            return new lcn1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
