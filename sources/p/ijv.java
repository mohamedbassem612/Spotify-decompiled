package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.zxing.FormatException;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ijv extends acq0 {
    public final /* synthetic */ byte c;

    public final boolean[] E(String str) {
        boolean[] zArr = null;
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!f5h1.u(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused) {
                            hhg1.n("Illegal contents");
                        }
                    } else {
                        hhg1.n("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    return zArr;
                }
                try {
                    str = f4i1.c(f5h1.v(str), str);
                } catch (FormatException e) {
                    throw new IllegalArgumentException(e);
                }
                int i = hjv.i[Character.digit(str.charAt(0), 10)];
                zArr = new boolean[95];
                int iZ = acq0.z(zArr, 0, f5h1.d, true);
                for (int i2 = 1; i2 <= 6; i2++) {
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    if (((i >> (6 - i2)) & 1) == 1) {
                        iDigit += 10;
                    }
                    iZ += acq0.z(zArr, iZ, f5h1.h[iDigit], false);
                }
                int iZ2 = acq0.z(zArr, iZ, f5h1.e, false) + iZ;
                for (int i3 = 7; i3 <= 12; i3++) {
                    iZ2 += acq0.z(zArr, iZ2, f5h1.g[Character.digit(str.charAt(i3), 10)], true);
                }
                acq0.z(zArr, iZ2, f5h1.d, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!f5h1.u(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused2) {
                            hhg1.n("Illegal contents");
                        }
                    } else {
                        hhg1.n("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    return zArr;
                }
                try {
                    str = f4i1.c(f5h1.v(str), str);
                } catch (FormatException e2) {
                    throw new IllegalArgumentException(e2);
                }
                zArr = new boolean[67];
                int iZ3 = acq0.z(zArr, 0, f5h1.d, true);
                for (int i4 = 0; i4 <= 3; i4++) {
                    iZ3 += acq0.z(zArr, iZ3, f5h1.g[Character.digit(str.charAt(i4), 10)], false);
                }
                int iZ4 = acq0.z(zArr, iZ3, f5h1.e, false) + iZ3;
                for (int i5 = 4; i5 <= 7; i5++) {
                    iZ4 += acq0.z(zArr, iZ4, f5h1.g[Character.digit(str.charAt(i5), 10)], true);
                }
                acq0.z(zArr, iZ4, f5h1.d, true);
                return zArr;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!f5h1.u(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused3) {
                            hhg1.n("Illegal contents");
                        }
                    } else {
                        hhg1.n("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    return zArr;
                }
                try {
                    str = f4i1.c(f5h1.v(hjv.w(str)), str);
                } catch (FormatException e3) {
                    throw new IllegalArgumentException(e3);
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 == 0 || iDigit2 == 1) {
                    int i6 = hjv.j[iDigit2][Character.digit(str.charAt(7), 10)];
                    zArr = new boolean[51];
                    int iZ5 = acq0.z(zArr, 0, f5h1.d, true);
                    for (int i7 = 1; i7 <= 6; i7++) {
                        int iDigit3 = Character.digit(str.charAt(i7), 10);
                        if (((i6 >> (6 - i7)) & 1) == 1) {
                            iDigit3 += 10;
                        }
                        iZ5 += acq0.z(zArr, iZ5, f5h1.h[iDigit3], false);
                    }
                    acq0.z(zArr, iZ5, f5h1.f, false);
                } else {
                    hhg1.n("Number system must be 0 or 1");
                }
                return zArr;
        }
    }

    public final int F() {
        return 9;
    }

    public final qwa j(String str, int i, int i2, int i3, Map map) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (i == 8) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode EAN_13, but got ".concat(l1d.D(i)));
                return null;
            case 1:
                if (i == 7) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode EAN_8, but got ".concat(l1d.D(i)));
                return null;
            default:
                if (i == 16) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode UPC_E, but got ".concat(l1d.D(i)));
                return null;
        }
    }
}
