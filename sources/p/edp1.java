package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class edp1 extends cip1 {
    private static final edp1 zzm;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private int zzk;
    private boolean zzl;

    static {
        edp1 edp1Var = new edp1();
        zzm = edp1Var;
        cip1.h(edp1.class, edp1Var);
    }

    public static cdp1 m() {
        return (cdp1) zzm.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", n9x0.Z0, "zzl"});
        }
        if (i2 == 3) {
            return new edp1();
        }
        if (i2 == 4) {
            return new cdp1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final /* synthetic */ void n(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void o(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void p(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void q(String str) {
        str.getClass();
        this.zzb |= 8;
        this.zzg = str;
    }

    public final /* synthetic */ void r(String str) {
        str.getClass();
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void s(String str) {
        str.getClass();
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void t(int i) {
        this.zzk = i - 1;
        this.zzb |= 128;
    }
}
