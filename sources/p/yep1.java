package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yep1 extends cip1 {
    private static final yep1 zzj;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private long zzi;
    private jip1 zzf = eip1.e;
    private lip1 zzh = rjp1.e;

    static {
        yep1 yep1Var = new yep1();
        zzj = yep1Var;
        cip1.h(yep1.class, yep1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzj, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zzb", "zzd", rdx0.a1, "zze", kcx0.a1, "zzf", pdx0.b1, "zzg", vbx0.Z0, "zzh", xep1.class, "zzi"});
        }
        if (i2 == 3) {
            return new yep1();
        }
        if (i2 == 4) {
            return new sdp1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
