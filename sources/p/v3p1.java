package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v3p1 extends cip1 {
    private static final v3p1 zzs;
    private int zzb;
    private b7p1 zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private ocp1 zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;

    static {
        v3p1 v3p1Var = new v3p1();
        zzs = v3p1Var;
        cip1.h(v3p1.class, v3p1Var);
    }

    public static s3p1 m() {
        return (s3p1) zzs.e();
    }

    public static s3p1 n(v3p1 v3p1Var) {
        yhp1 yhp1VarE = zzs.e();
        cip1 cip1Var = yhp1VarE.a;
        if (!cip1Var.equals(v3p1Var)) {
            if (!yhp1VarE.b.k()) {
                cip1 cip1Var2 = (cip1) cip1Var.j(4, null);
                qjp1.c.a(cip1Var2.getClass()).a(cip1Var2, yhp1VarE.b);
                yhp1VarE.b = cip1Var2;
            }
            cip1 cip1Var3 = yhp1VarE.b;
            qjp1.c.a(cip1Var3.getClass()).a(cip1Var3, v3p1Var);
        }
        return (s3p1) yhp1VarE;
    }

    public static v3p1 o() {
        return zzs;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzs, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", y6x0.Z0, "zzi", r6x0.a1, "zzj", "zzk", "zzl", "zzm", pdx0.a1, "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new v3p1();
        }
        if (i2 == 4) {
            return new s3p1(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        throw null;
    }

    public final /* synthetic */ void p(b7p1 b7p1Var) {
        this.zzd = b7p1Var;
        this.zzb |= 1;
    }

    public final /* synthetic */ void q(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void s(int i) {
        this.zzb |= 64;
        this.zzj = i;
    }

    public final /* synthetic */ void t(int i) {
        this.zzb |= 128;
        this.zzk = i;
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1024;
        this.zzn = i;
    }

    public final /* synthetic */ void v(boolean z) {
        this.zzb |= 2048;
        this.zzo = z;
    }

    public final /* synthetic */ void w() {
        this.zzb |= 4096;
        this.zzp = 0;
    }

    public final /* synthetic */ void x() {
        this.zzb |= 8192;
        this.zzq = 101;
    }

    public final /* synthetic */ void y(boolean z) {
        this.zzb |= 16384;
        this.zzr = z;
    }
}
