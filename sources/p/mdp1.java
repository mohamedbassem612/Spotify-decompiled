package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mdp1 extends cip1 {
    private static final mdp1 zzo;
    private int zzb;
    private b7p1 zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private int zzl;
    private int zzm;
    private String zzd = "";
    private jip1 zzn = eip1.e;

    static {
        mdp1 mdp1Var = new mdp1();
        zzo = mdp1Var;
        cip1.h(mdp1.class, mdp1Var);
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzo, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဂ\u0006\u0006ဂ\u0007\u0007င\b\bင\t\t'\nဈ\u0000\u000bဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzj", "zzk", "zzl", "zzm", "zzn", "zzd", "zzi"});
        }
        if (i2 == 3) {
            return new mdp1();
        }
        if (i2 == 4) {
            return new a9p1(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        throw null;
    }
}
