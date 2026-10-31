package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hk70 extends acq0 {
    public static final int[] d = {1, 1, 1, 1};
    public static final int[] e = {3, 1, 1};
    public static final int[][] f = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public final /* synthetic */ byte c;

    public static void Q(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    public static int R(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static int S(int i, CharSequence charSequence) {
        char cCharAt;
        int length = charSequence.length();
        if (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 == 241) {
                return 4;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (cCharAt = charSequence.charAt(i2)) >= '0' && cCharAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static void T(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static void U(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0270  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0 A[LOOP:4: B:78:0x01be->B:79:0x01c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e1 A[LOOP:5: B:82:0x01df->B:83:0x01e1, LOOP_END] */
    public final boolean[] E(String str) {
        int i;
        int i2;
        int i3;
        char c;
        int iS;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        boolean[] zArr;
        int[] iArr2;
        int iZ;
        int i8;
        int i9;
        String string = str;
        char c2 = '`';
        char c3 = ' ';
        int i10 = 9;
        int iZ2 = 0;
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int length = string.length();
                if (length % 2 != 0) {
                    hhg1.n("The length of the input should be even");
                } else {
                    if (length <= 80) {
                        boolean[] zArr2 = new boolean[(length * 9) + 9];
                        int iZ3 = acq0.z(zArr2, 0, d, true);
                        for (int i11 = 0; i11 < length; i11 += 2) {
                            int iDigit = Character.digit(string.charAt(i11), 10);
                            int iDigit2 = Character.digit(string.charAt(i11 + 1), 10);
                            int[] iArr3 = new int[10];
                            for (int i12 = 0; i12 < 5; i12++) {
                                int i13 = i12 * 2;
                                int[][] iArr4 = f;
                                iArr3[i13] = iArr4[iDigit][i12];
                                iArr3[i13 + 1] = iArr4[iDigit2][i12];
                            }
                            iZ3 += acq0.z(zArr2, iZ3, iArr3, true);
                        }
                        acq0.z(zArr2, iZ3, e, true);
                        return zArr2;
                    }
                    hhg1.n("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                return null;
            case 1:
                int[][] iArr5 = awg.f;
                int length2 = string.length();
                if (length2 > 0 && length2 <= 80) {
                    for (int i14 = 0; i14 < length2; i14++) {
                        char cCharAt = string.charAt(i14);
                        switch (cCharAt) {
                            case 241:
                            case 242:
                            case 243:
                            case 244:
                                continue;
                                break;
                            default:
                                if (cCharAt > 127) {
                                    hhg1.n("Bad character in input: ".concat(String.valueOf(cCharAt)));
                                }
                                break;
                        }
                    }
                    ArrayList<int[]> arrayList = new ArrayList();
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 1;
                    while (i15 < length2) {
                        int iS2 = S(i15, string);
                        int iCharAt = 100;
                        if (iS2 == 2) {
                            c = c3;
                            i3 = 100;
                            i = 103;
                            i2 = 96;
                        } else {
                            i = 103;
                            if (iS2 != 1) {
                                i2 = 96;
                                i3 = 99;
                                if (i17 == 99) {
                                    c = c3;
                                } else {
                                    c = c3;
                                    if (i17 == 100) {
                                        if (iS2 != 4 && (iS = S(i15 + 2, string)) != 1 && iS != 2) {
                                            if (iS != 4) {
                                                int i19 = i15 + 4;
                                                while (true) {
                                                    int iS3 = S(i19, string);
                                                    if (iS3 == 3) {
                                                        i19 += 2;
                                                    } else if (iS3 != 2) {
                                                        i3 = 99;
                                                    }
                                                }
                                            } else if (S(i15 + 3, string) == 3) {
                                                i3 = 99;
                                            }
                                        }
                                        i3 = 100;
                                    } else {
                                        if (iS2 == 4) {
                                            iS2 = S(i15 + 1, string);
                                        }
                                        if (iS2 == 3) {
                                            i3 = 99;
                                        } else {
                                            i3 = 100;
                                        }
                                    }
                                }
                            } else if (i15 >= string.length()) {
                                i4 = 96;
                                c = c3;
                                i2 = i4;
                                i3 = 100;
                            } else {
                                char cCharAt2 = string.charAt(i15);
                                if (cCharAt2 >= c3) {
                                    if (i17 == 101) {
                                        i4 = 96;
                                        if (cCharAt2 < '`') {
                                        }
                                    } else {
                                        i4 = 96;
                                    }
                                    c = c3;
                                    i2 = i4;
                                    i3 = 100;
                                } else {
                                    i4 = 96;
                                }
                                c = c3;
                                i2 = i4;
                                i3 = 101;
                            }
                        }
                        if (i3 == i17) {
                            switch (string.charAt(i15)) {
                                case 241:
                                    iCharAt = 102;
                                    break;
                                case 242:
                                    iCharAt = 97;
                                    break;
                                case 243:
                                    iCharAt = i2;
                                    break;
                                case 244:
                                    if (i17 == 101) {
                                        iCharAt = 101;
                                    }
                                    break;
                                default:
                                    if (i17 == 100) {
                                        iCharAt = string.charAt(i15) - ' ';
                                    } else if (i17 != 101) {
                                        iCharAt = Integer.parseInt(string.substring(i15, i15 + 2));
                                        i15++;
                                    } else {
                                        char cCharAt3 = string.charAt(i15);
                                        iCharAt = cCharAt3 - ' ';
                                        if (iCharAt < 0) {
                                            iCharAt = cCharAt3 + '@';
                                        }
                                    }
                                    break;
                            }
                            i15++;
                        } else {
                            if (i17 != 0) {
                                i5 = i3;
                            } else if (i3 != 100) {
                                i5 = i3 != 101 ? 105 : i;
                            } else {
                                i5 = 104;
                            }
                            iCharAt = i5;
                            i17 = i3;
                        }
                        arrayList.add(iArr5[iCharAt]);
                        i16 += iCharAt * i18;
                        if (i15 != 0) {
                            i18++;
                        }
                        c3 = c;
                    }
                    arrayList.add(iArr5[i16 % 103]);
                    arrayList.add(iArr5[106]);
                    int i20 = 0;
                    for (int[] iArr6 : arrayList) {
                        for (int i21 : iArr6) {
                            i20 += i21;
                        }
                    }
                    boolean[] zArr3 = new boolean[i20];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        iZ2 += acq0.z(zArr3, iZ2, (int[]) it.next(), true);
                    }
                    return zArr3;
                }
                hhg1.n("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length2)));
                return null;
            case 2:
                int[] iArr7 = awg.g;
                int length3 = string.length();
                if (length3 <= 80) {
                    int i22 = 0;
                    while (i22 < length3) {
                        if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i22)) < 0) {
                            int length4 = string.length();
                            StringBuilder sb = new StringBuilder();
                            int i23 = 0;
                            while (i23 < length4) {
                                char cCharAt4 = string.charAt(i23);
                                if (cCharAt4 == 0) {
                                    sb.append("%U");
                                } else if (cCharAt4 == ' ') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 == '@') {
                                    sb.append("%V");
                                } else if (cCharAt4 == c2) {
                                    sb.append("%W");
                                } else if (cCharAt4 == '-' || cCharAt4 == '.') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 <= 26) {
                                    sb.append('$');
                                    sb.append((char) (cCharAt4 + '@'));
                                } else if (cCharAt4 < ' ') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 + '&'));
                                } else if (cCharAt4 <= ',' || cCharAt4 == '/' || cCharAt4 == ':') {
                                    sb.append('/');
                                    sb.append((char) (cCharAt4 + ' '));
                                } else if (cCharAt4 <= '9') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 <= '?') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 + 11));
                                } else if (cCharAt4 <= 'Z') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 <= '_') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 - 16));
                                } else if (cCharAt4 <= 'z') {
                                    sb.append('+');
                                    sb.append((char) (cCharAt4 - ' '));
                                } else {
                                    if (cCharAt4 > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + string.charAt(i23) + "'");
                                    }
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 - '+'));
                                }
                                i23++;
                                c2 = '`';
                            }
                            string = sb.toString();
                            length3 = string.length();
                            if (length3 > 80) {
                                hhg1.n(gvg.e(length3, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                            }
                            iArr = new int[9];
                            i6 = length3 + 25;
                            for (i7 = 0; i7 < length3; i7++) {
                                T(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i7))], iArr);
                                for (i9 = 0; i9 < 9; i9++) {
                                    i6 += iArr[i9];
                                }
                            }
                            zArr = new boolean[i6];
                            T(148, iArr);
                            int iZ4 = acq0.z(zArr, 0, iArr, true);
                            iArr2 = new int[]{1};
                            iZ = acq0.z(zArr, iZ4, iArr2, false) + iZ4;
                            for (i8 = 0; i8 < length3; i8++) {
                                T(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i8))], iArr);
                                int iZ5 = acq0.z(zArr, iZ, iArr, true) + iZ;
                                iZ = acq0.z(zArr, iZ5, iArr2, false) + iZ5;
                            }
                            T(148, iArr);
                            acq0.z(zArr, iZ, iArr, true);
                            return zArr;
                        }
                        i22++;
                        c2 = '`';
                    }
                    iArr = new int[9];
                    i6 = length3 + 25;
                    while (i7 < length3) {
                        T(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i7))], iArr);
                        while (i9 < 9) {
                            i6 += iArr[i9];
                        }
                    }
                    zArr = new boolean[i6];
                    T(148, iArr);
                    int iZ6 = acq0.z(zArr, 0, iArr, true);
                    iArr2 = new int[]{1};
                    iZ = acq0.z(zArr, iZ6, iArr2, false) + iZ6;
                    while (i8 < length3) {
                        T(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i8))], iArr);
                        int iZ7 = acq0.z(zArr, iZ, iArr, true) + iZ;
                        iZ = acq0.z(zArr, iZ7, iArr2, false) + iZ7;
                    }
                    T(148, iArr);
                    acq0.z(zArr, iZ, iArr, true);
                    return zArr;
                }
                hhg1.n("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
                return null;
            default:
                int[] iArr8 = awg.h;
                int length5 = string.length();
                if (length5 > 80) {
                    hhg1.n("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length5)));
                    return null;
                }
                int[] iArr9 = new int[9];
                int length6 = ((string.length() + 4) * 9) + 1;
                U(iArr8[47], iArr9);
                boolean[] zArr4 = new boolean[length6];
                Q(zArr4, 0, iArr9);
                while (iZ2 < length5) {
                    U(iArr8["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(string.charAt(iZ2))], iArr9);
                    Q(zArr4, i10, iArr9);
                    i10 += 9;
                    iZ2++;
                }
                int iR = R(20, string);
                U(iArr8[iR], iArr9);
                Q(zArr4, i10, iArr9);
                U(iArr8[R(15, string + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iR))], iArr9);
                Q(zArr4, i10 + 9, iArr9);
                U(iArr8[47], iArr9);
                Q(zArr4, i10 + 18, iArr9);
                zArr4[i10 + 27] = true;
                return zArr4;
        }
    }

    public final qwa j(String str, int i, int i2, int i3, Map map) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (i == 9) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode ITF, but got ".concat(l1d.D(i)));
                return null;
            case 1:
                if (i == 5) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode CODE_128, but got ".concat(l1d.D(i)));
                return null;
            case 2:
                if (i == 3) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode CODE_39, but got ".concat(l1d.D(i)));
                return null;
            default:
                if (i == 4) {
                    return super.j(str, i, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, map);
                }
                hhg1.n("Can only encode CODE_93, but got ".concat(l1d.D(i)));
                return null;
        }
    }
}
