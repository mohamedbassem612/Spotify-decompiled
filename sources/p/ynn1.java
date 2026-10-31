package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ynn1 extends rin1 {
    private static final ynn1 zzf;
    private int zza;
    private int zzd;
    private int zze;

    static {
        ynn1 ynn1Var = new ynn1();
        zzf = ynn1Var;
        rin1.m(ynn1.class, ynn1Var);
    }

    public static ynn1 y(byte[] bArr) {
        return (ynn1) rin1.p(zzf, bArr);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new ynn1();
        }
        if (i2 == 4) {
            return new jkn1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(ynn1.class);
    }

    public final znn1 x() {
        znn1 znn1Var;
        switch (this.zze) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                znn1Var = znn1.JS_CODE_UNSPECIFIED;
                break;
            case 1:
                znn1Var = znn1.JS_CODE_SUCCESS;
                break;
            case 2:
                znn1Var = znn1.JS_NETWORK_ERROR;
                break;
            case 3:
                znn1Var = znn1.JS_INTERNAL_ERROR;
                break;
            case 4:
                znn1Var = znn1.JS_INVALID_SITE_KEY;
                break;
            case 5:
                znn1Var = znn1.JS_INVALID_SITE_KEY_TYPE;
                break;
            case 6:
                znn1Var = znn1.JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED;
                break;
            case 7:
                znn1Var = znn1.JS_INVALID_ACTION;
                break;
            case 8:
                znn1Var = znn1.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED;
                break;
            case 9:
                znn1Var = znn1.JS_PROGRAM_ERROR;
                break;
            default:
                znn1Var = null;
                break;
        }
        return znn1Var == null ? znn1.UNRECOGNIZED : znn1Var;
    }
}
