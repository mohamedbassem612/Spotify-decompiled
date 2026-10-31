package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tno1 extends iao1 {
    private static final tno1 zzb;
    private int zzd;
    private int zzf;
    private umo1 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private abo1 zzg = mao1.e;
    private ebo1 zzh = kgo1.e;

    static {
        tno1 tno1Var = new tno1();
        zzb = tno1Var;
        iao1.f(tno1.class, tno1Var);
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", c3o1.f, "zzg", c3o1.e, "zzh", tqo1.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new tno1();
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
