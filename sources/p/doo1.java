package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class doo1 extends iao1 {
    private static final doo1 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        doo1 doo1Var = new doo1();
        zzb = doo1Var;
        iao1.f(doo1.class, doo1Var);
    }

    public static xno1 A() {
        return (xno1) zzb.k();
    }

    public static /* synthetic */ void B(doo1 doo1Var, int i) {
        doo1Var.zzd |= 128;
        doo1Var.zzl = i;
    }

    public static /* synthetic */ void C(doo1 doo1Var, int i) {
        doo1Var.zzd |= 256;
        doo1Var.zzm = i;
    }

    public static /* synthetic */ void D(doo1 doo1Var, int i) {
        doo1Var.zzd |= 8;
        doo1Var.zzh = i;
    }

    public static /* synthetic */ void E(doo1 doo1Var, long j) {
        doo1Var.zzd |= 16;
        doo1Var.zzi = j;
    }

    public static /* synthetic */ void F(doo1 doo1Var, long j) {
        doo1Var.zzd |= 32;
        doo1Var.zzj = j;
    }

    public static /* synthetic */ void q(doo1 doo1Var) {
        doo1Var.zzd |= 512;
        doo1Var.zzn = 846465066L;
    }

    public static /* synthetic */ void r(doo1 doo1Var, String str) {
        str.getClass();
        doo1Var.zzd |= 4;
        doo1Var.zzg = str;
    }

    public static /* synthetic */ void s(doo1 doo1Var) {
        String str = Build.BRAND;
        str.getClass();
        doo1Var.zzd |= 1024;
        doo1Var.zzo = str;
    }

    public static /* synthetic */ void t(doo1 doo1Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        doo1Var.zzd |= 8192;
        doo1Var.zzr = str;
    }

    public static /* synthetic */ void u(doo1 doo1Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        doo1Var.zzd |= 4096;
        doo1Var.zzq = str;
    }

    public static /* synthetic */ void v(doo1 doo1Var) {
        String str = Build.MODEL;
        str.getClass();
        doo1Var.zzd |= 2048;
        doo1Var.zzp = str;
    }

    public static /* synthetic */ void w(doo1 doo1Var, int i) {
        doo1Var.zzd |= 16384;
        doo1Var.zzs = i;
    }

    public static /* synthetic */ void x(doo1 doo1Var, boolean z) {
        doo1Var.zzd |= 64;
        doo1Var.zzk = z;
    }

    public static /* synthetic */ void y(doo1 doo1Var) {
        doo1Var.zzd |= 1;
        doo1Var.zze = "8.3.0";
    }

    public static /* synthetic */ void z(doo1 doo1Var, String str) {
        doo1Var.zzd |= 2;
        doo1Var.zzf = str;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new doo1();
        }
        if (i2 == 4) {
            return new xno1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
