package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ihc1 extends nhc1 {
    public static int A0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = q0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iQ0 = q0(charSequence);
        if (i > iQ0) {
            i = iQ0;
        }
        while (-1 < i) {
            if (eth.q(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int B0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = q0(charSequence);
        }
        int i3 = i;
        return !(charSequence instanceof String) ? u0(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    public static i46 C0(CharSequence charSequence) {
        return new i46(charSequence, (byte) 7);
    }

    public static List D0(CharSequence charSequence) {
        ejc0 ejc0Var = new ejc0(charSequence);
        if (!ejc0Var.hasNext()) {
            return z6x.a;
        }
        Object next = ejc0Var.next();
        if (!ejc0Var.hasNext()) {
            return k4p1.x(next);
        }
        ArrayList arrayListH = ydh.h(next);
        while (ejc0Var.hasNext()) {
            arrayListH.add(ejc0Var.next());
        }
        return arrayListH;
    }

    public static String E0(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            hhg1.n(gvg.e(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String F0(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            hhg1.n(gvg.e(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean G0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!eth.q(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String H0(String str, CharSequence charSequence) {
        return S0(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    public static CharSequence I0(int i, int i2, CharSequence charSequence) {
        if (i2 < i) {
            eg.g(l1d.j(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static String J0(String str, String str2) {
        return o0(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String K0(String str) {
        return L0(str, "\"", "\"");
    }

    public static String L0(String str, String str2, String str3) {
        return (str.length() >= str3.length() + str2.length() && S0(str, str2) && o0(str3, str)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static StringBuilder M0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            eg.g(l1d.j(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void N0(int i) {
        if (i >= 0) {
            return;
        }
        hhg1.f(f4i1.c(i, "Limit must be non-negative, but was "));
    }

    public static final List O0(int i, CharSequence charSequence, String str, boolean z) {
        N0(i);
        int length = 0;
        int iT0 = t0(0, charSequence, str, z);
        if (iT0 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iT0).toString());
            length = str.length() + iT0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iT0 = t0(length, charSequence, str, z);
        } while (iT0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List P0(CharSequence charSequence, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (cArr.length == 1) {
            return O0(i2, charSequence, String.valueOf(cArr[0]), false);
        }
        N0(i2);
        t9t<tr80> t9tVar = new t9t(charSequence, i2, new w9(cArr, (byte) 25));
        ArrayList arrayList = new ArrayList(q7h.U(new h46(t9tVar, (byte) 2), 10));
        for (tr80 tr80Var : t9tVar) {
            arrayList.add(charSequence.subSequence(tr80Var.a, tr80Var.b + 1).toString());
        }
        return arrayList;
    }

    public static List Q0(CharSequence charSequence, String[] strArr, int i, int i2) {
        boolean z = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return O0(i, charSequence, str, z);
            }
        }
        N0(i);
        t9t<tr80> t9tVar = new t9t(charSequence, i, new fc4(Arrays.asList(strArr), z, (byte) 4));
        ArrayList arrayList = new ArrayList(q7h.U(new h46(t9tVar, (byte) 2), 10));
        for (tr80 tr80Var : t9tVar) {
            arrayList.add(charSequence.subSequence(tr80Var.a, tr80Var.b + 1).toString());
        }
        return arrayList;
    }

    public static boolean R0(String str, char c) {
        return str.length() > 0 && eth.q(str.charAt(0), c, false);
    }

    public static boolean S0(String str, CharSequence charSequence) {
        return charSequence instanceof String ? nhc1.Y(str, (String) charSequence, false) : G0(str, 0, charSequence, 0, charSequence.length(), false);
    }

    public static String T0(String str, char c, String str2) {
        int iV0 = v0(str, c, 0, 6);
        return iV0 == -1 ? str2 : str.substring(iV0 + 1, str.length());
    }

    public static String U0(String str, String str2, String str3) {
        int iW0 = w0(str, str2, 0, false, 6);
        return iW0 == -1 ? str3 : str.substring(str2.length() + iW0, str.length());
    }

    public static String V0(String str, char c, String str2) {
        int iA0 = A0(str, c, 0, 6);
        return iA0 == -1 ? str2 : str.substring(iA0 + 1, str.length());
    }

    public static String X0(String str, String str2) {
        int iB0 = B0(str, str2, 0, 6);
        return iB0 == -1 ? str : str.substring(str2.length() + iB0, str.length());
    }

    public static String Y0(String str, char c) {
        int iV0 = v0(str, c, 0, 6);
        return iV0 == -1 ? str : str.substring(0, iV0);
    }

    public static String Z0(String str, String str2) {
        int iW0 = w0(str, str2, 0, false, 6);
        return iW0 == -1 ? str : str.substring(0, iW0);
    }

    public static String a1(String str, char c) {
        int iA0 = A0(str, c, 0, 6);
        return iA0 == -1 ? str : str.substring(0, iA0);
    }

    public static CharSequence b1(int i, CharSequence charSequence) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String c1(int i, String str) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static Boolean d1(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static ArrayList e0(CharSequence charSequence) {
        o0c.r(2, 2);
        int length = charSequence.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i2 = i + 2;
            arrayList.add(charSequence.subSequence(i, (i2 < 0 || i2 > length) ? length : i2).toString());
            i = i2;
        }
        return arrayList;
    }

    public static CharSequence e1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zH = eth.H(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zH) {
                    break;
                }
                length--;
            } else if (zH) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String f0(CharSequence charSequence, CharSequence charSequence2) {
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < iMin && eth.q(charSequence.charAt(i), charSequence2.charAt(i), false)) {
            i++;
        }
        int i2 = i - 1;
        if (s0(i2, charSequence) || s0(i2, charSequence2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static CharSequence f1(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!eth.H(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String g0(String str, CharSequence charSequence) {
        int length = str.length();
        int length2 = charSequence.length();
        int iMin = Math.min(length, length2);
        int i = 0;
        while (i < iMin && eth.q(str.charAt((length - i) - 1), charSequence.charAt((length2 - i) - 1), false)) {
            i++;
        }
        if (s0((length - i) - 1, str) || s0((length2 - i) - 1, charSequence)) {
            i--;
        }
        return str.subSequence(length - i, length).toString();
    }

    public static String g1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!f46.K(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (w0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (u0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static String h1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!f46.K(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static boolean i0(CharSequence charSequence, char c) {
        return v0(charSequence, c, 0, 2) >= 0;
    }

    public static final boolean k0(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("wrapped-share");
        }
        if (str != "wrapped-share") {
            if (str != null && str.length() == 13) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (eth.q(str.charAt(i), "wrapped-share".charAt(i), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String l0(int i, String str) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String m0(int i, String str) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return c1(length, str);
    }

    public static boolean n0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && eth.q(charSequence.charAt(q0(charSequence)), c, false);
    }

    public static boolean o0(String str, CharSequence charSequence) {
        return charSequence instanceof String ? nhc1.R((String) charSequence, str, false) : G0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static char p0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        bhn0.t("Char sequence is empty.");
        return (char) 0;
    }

    public static int q0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static Character r0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final boolean s0(int i, CharSequence charSequence) {
        return i >= 0 && i <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static int t0(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? u0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int u0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        rr80 rr80VarM;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iQ0 = q0(charSequence);
            if (i3 > iQ0) {
                i3 = iQ0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            rr80VarM = ebp1.m(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            rr80VarM = new tr80(i3, i4, 1);
        }
        int i5 = rr80VarM.c;
        int i6 = rr80VarM.b;
        int i7 = rr80VarM.a;
        if ((charSequence instanceof String) && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!G0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int v0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? x0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int w0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return t0(i, charSequence, str, z);
    }

    public static final int x0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                bhn0.t("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            hhg1.n("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int iQ0 = q0(charSequence);
        if (i > iQ0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (eth.q(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iQ0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean y0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!eth.H(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char z0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(q0(charSequence));
        }
        bhn0.t("Char sequence is empty.");
        return (char) 0;
    }
}
