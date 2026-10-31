package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bwg extends acq0 {
    public static final char[] c;
    public static final char[] d = {'T', 'N', '*', 'E'};
    public static final char[] e = {'/', ':', '+', '.'};
    public static final char f;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        c = cArr;
        f = cArr[0];
    }

    public final boolean[] E(String str) {
        int i;
        int length = str.length();
        char c2 = f;
        if (length < 2) {
            str = c2 + str + c2;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = c;
            boolean zU = awg.u(cArr, upperCase);
            boolean zU2 = awg.u(cArr, upperCase2);
            char[] cArr2 = d;
            boolean zU3 = awg.u(cArr2, upperCase);
            boolean zU4 = awg.u(cArr2, upperCase2);
            if (zU) {
                if (!zU2) {
                    hhg1.n("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!zU3) {
                if (zU2 || zU4) {
                    hhg1.n("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c2 + str + c2;
            } else if (!zU4) {
                hhg1.n("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!awg.u(e, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = awg.d;
                if (i6 >= 20) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = awg.e[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
