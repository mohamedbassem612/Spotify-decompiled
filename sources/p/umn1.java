package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class umn1 extends rin1 {
    private static final umn1 zzo;
    private int zza;
    private long zze;
    private int zzf;
    private ain1 zzh;
    private String zzi;
    private String zzj;
    private ain1 zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzd = "";
    private win1 zzg = mjn1.e;

    static {
        umn1 umn1Var = new umn1();
        zzo = umn1Var;
        rin1.m(umn1.class, umn1Var);
    }

    public umn1() {
        vhn1 vhn1Var = ain1.b;
        this.zzh = vhn1Var;
        this.zzi = "";
        this.zzj = "";
        this.zzk = vhn1Var;
        this.zzl = "";
        this.zzm = "";
        this.zzn = "";
    }

    public static umn1 B() {
        return zzo;
    }

    public final ain1 A() {
        return this.zzk;
    }

    public final int C() {
        int i;
        int i2 = this.zzf;
        if (i2 == 15) {
            i = 17;
        } else if (i2 != 16) {
            switch (i2) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 18;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzo, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005\tည\u0006\nለ\u0007\u000bለ\b\fለ\t", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", vmn1.class, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new umn1();
        }
        if (i2 == 4) {
            return new jkn1(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(umn1.class);
    }

    public final String x() {
        return this.zzd;
    }

    public final win1 y() {
        return this.zzg;
    }

    public final ain1 z() {
        return this.zzh;
    }
}
