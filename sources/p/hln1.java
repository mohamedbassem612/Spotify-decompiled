package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hln1 extends rin1 {
    private static final hln1 zzm;
    private int zza;
    private int zzd;
    private int zze;
    private gin1 zzh;
    private akn1 zzi;
    private int zzj;
    private ykn1 zzk;
    private String zzf = "";
    private String zzg = "";
    private win1 zzl = mjn1.e;

    static {
        hln1 hln1Var = new hln1();
        zzm = hln1Var;
        rin1.m(hln1.class, hln1Var);
    }

    public static hln1 x() {
        return zzm;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzm, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zza", "zzd", "zzh", "zzi", "zzj", "zzl", dln1.class, "zze", "zzf", "zzg", "zzk"});
        }
        if (i2 == 3) {
            return new hln1();
        }
        if (i2 == 4) {
            return new jkn1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(hln1.class);
    }
}
