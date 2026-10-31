package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k370 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = p7h.O("");

    public static ArrayList k(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iV0 = ihc1.v0(str, '&', i, 4);
            if (iV0 == -1) {
                iV0 = str.length();
            }
            int iV1 = ihc1.v0(str, '=', i, 4);
            if (iV1 == -1 || iV1 > iV0) {
                arrayList.add(str.substring(i, iV0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iV1));
                arrayList.add(str.substring(iV1 + 1, iV0));
            }
            i = iV0 + 1;
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g = arrayList;
        }
        arrayList.add(mno1.i(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false));
        ArrayList arrayList2 = this.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? mno1.i(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false) : null);
    }

    public final l370 b() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            eg.m("scheme == null");
            return null;
        }
        String strT = mno1.t(0, 0, 7, this.b);
        String strT2 = mno1.t(0, 0, 7, this.c);
        String str2 = this.d;
        if (str2 == null) {
            eg.m("host == null");
            return null;
        }
        int iC = c();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(mno1.t(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(q7h.U(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? mno1.t(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new l370(str, strT, strT2, str2, iC, arrayList3, arrayList, str4 != null ? mno1.t(0, 0, 7, str4) : null, toString());
    }

    public final int c() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(m3i1.b) ? 443 : -1;
    }

    public final void d(String str) {
        this.g = str != null ? k(mno1.i(0, 0, 83, str, " \"'<>#", true)) : null;
    }

    public final void e(String str) {
        String strB = u4n1.b(mno1.t(0, 0, 7, str));
        if (strB != null) {
            this.d = strB;
        } else {
            hhg1.n("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0023  */
    public final void f(l370 l370Var, String str) {
        int i;
        String str2;
        String str3;
        int iD;
        char c;
        char c2;
        ArrayList arrayList;
        char c3;
        String str4;
        int i2;
        int i3;
        char c4;
        String str5;
        boolean z;
        char cCharAt;
        k370 k370Var = this;
        byte[] bArr = w4n1.a;
        int i4 = w4n1.i(0, str.length(), str);
        int iJ = w4n1.j(i4, str.length(), str);
        int i5 = -1;
        if (iJ - i4 >= 2) {
            char cCharAt2 = str.charAt(i4);
            if ((u890.q(cCharAt2, 97) >= 0 && u890.q(cCharAt2, 122) <= 0) || (u890.q(cCharAt2, 65) >= 0 && u890.q(cCharAt2, 90) <= 0)) {
                int i6 = i4 + 1;
                while (true) {
                    if (i6 < iJ) {
                        char cCharAt3 = str.charAt(i6);
                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i6++;
                        } else if (cCharAt3 == ':') {
                            i = i6;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        if (i != -1) {
            str3 = m3i1.b;
            if (str.regionMatches(true, i4, "https:", 0, 6)) {
                k370Var.a = str3;
                iD = i4 + 6;
                str2 = str;
            } else {
                str2 = str;
                if (!str.regionMatches(true, i4, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, i) + '\'');
                }
                k370Var.a = "http";
                iD = i4 + 5;
            }
        } else {
            str2 = str;
            str3 = m3i1.b;
            if (l370Var == null) {
                hhg1.n("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? ihc1.c1(6, str2).concat("...") : str2));
                return;
            } else {
                k370Var.a = l370Var.a;
                iD = i4;
            }
        }
        int i7 = iD;
        int i8 = 0;
        while (true) {
            c = '\\';
            c2 = '/';
            if (i7 >= iJ || !((cCharAt = str2.charAt(i7)) == '/' || cCharAt == '\\')) {
                break;
            }
            i8++;
            i7++;
        }
        char c5 = '?';
        ArrayList arrayList2 = k370Var.f;
        char c6 = '#';
        if (i8 >= 2 || l370Var == null || !u890.j(l370Var.a, k370Var.a)) {
            int i9 = iD + i8;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                iD = w4n1.d(i9, str2, iJ, "@/\\?#");
                byte bCharAt = iD != iJ ? str2.charAt(iD) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c6 || bCharAt == c2 || bCharAt == c || bCharAt == c5) {
                    break;
                }
                if (bCharAt != 64) {
                    c2 = '/';
                } else {
                    if (z2) {
                        c4 = '/';
                        StringBuilder sb = new StringBuilder(k370Var.c);
                        sb.append("%40");
                        str5 = str;
                        sb.append(mno1.i(i9, iD, 112, str5, " \"':;<=>@[]^`{}|/\\?#", true));
                        k370Var.c = sb.toString();
                    } else {
                        int iE = w4n1.e(str2, ':', i9, iD);
                        c4 = '/';
                        String strI = mno1.i(i9, iE, 112, str, " \"':;<=>@[]^`{}|/\\?#", true);
                        if (z3) {
                            strI = l1d.n("%40", strI, new StringBuilder(k370Var.b));
                        }
                        k370Var.b = strI;
                        if (iE != iD) {
                            int i10 = iE + 1;
                            iD = iD;
                            k370Var.c = mno1.i(i10, iD, 112, str, " \"':;<=>@[]^`{}|/\\?#", true);
                            z = true;
                        } else {
                            iD = iD;
                            z = z2;
                        }
                        str5 = str;
                        z2 = z;
                        z3 = true;
                    }
                    i9 = iD + 1;
                    str2 = str5;
                    c2 = c4;
                    c6 = '#';
                    c5 = '?';
                    c = '\\';
                    arrayList2 = arrayList2;
                }
            }
            int i11 = i9;
            arrayList = arrayList2;
            c3 = c2;
            str4 = str2;
            int i12 = i11;
            while (true) {
                if (i12 < iD) {
                    char cCharAt4 = str4.charAt(i12);
                    if (cCharAt4 == ':') {
                        i2 = i12;
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i12++;
                            if (i12 >= iD) {
                                break;
                            }
                        } while (str4.charAt(i12) != ']');
                    }
                    i12++;
                } else {
                    i2 = iD;
                    break;
                }
            }
            int i13 = i2 + 1;
            if (i13 < iD) {
                k370Var.d = u4n1.b(mno1.t(i11, i2, 4, str4));
                try {
                    i3 = Integer.parseInt(mno1.i(i13, iD, 120, str4, "", false));
                    if (1 > i3 || i3 >= 65536) {
                        i3 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                k370Var.e = i3;
                if (i3 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str4.substring(i13, iD) + '\"').toString());
                }
            } else {
                k370Var.d = u4n1.b(mno1.t(i11, i2, 4, str4));
                String str6 = k370Var.a;
                str6.getClass();
                if (str6.equals("http")) {
                    i5 = 80;
                } else if (str6.equals(str3)) {
                    i5 = 443;
                }
                k370Var.e = i5;
            }
            if (k370Var.d == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str4.substring(i11, i2) + '\"').toString());
            }
        } else {
            k370Var.b = l370Var.e();
            k370Var.c = l370Var.a();
            k370Var.d = l370Var.d;
            k370Var.e = l370Var.e;
            arrayList2.clear();
            arrayList2.addAll(l370Var.c());
            if (iD == iJ || str2.charAt(iD) == '#') {
                k370Var.d(l370Var.d());
            }
            arrayList = arrayList2;
            c3 = '/';
            str4 = str2;
        }
        int iD2 = w4n1.d(iD, str4, iJ, "?#");
        if (iD != iD2) {
            char cCharAt5 = str4.charAt(iD);
            if (cCharAt5 == c3 || cCharAt5 == '\\') {
                ArrayList arrayList3 = arrayList;
                arrayList3.clear();
                arrayList3.add("");
                iD++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            int i14 = iD;
            while (i14 < iD2) {
                int iD3 = w4n1.d(i14, str4, iD2, "/\\");
                String str7 = str4;
                boolean z4 = iD3 < iD2;
                k370Var.h(i14, iD3, str7, z4, true);
                k370 k370Var2 = k370Var;
                str4 = str7;
                i14 = z4 ? iD3 + 1 : iD3;
                k370Var = k370Var2;
            }
        }
        k370 k370Var3 = k370Var;
        if (iD2 < iJ && str4.charAt(iD2) == '?') {
            int iE2 = w4n1.e(str4, '#', iD2, iJ);
            str4 = str;
            k370Var3.g = k(mno1.i(iD2 + 1, iE2, 80, str, " \"'<>#", true));
            iD2 = iE2;
        }
        if (iD2 >= iJ || str4.charAt(iD2) != '#') {
            return;
        }
        k370Var3.h = mno1.i(iD2 + 1, iJ, 48, str, "", true);
    }

    public final void g(int i) {
        if (1 > i || i >= 65536) {
            hhg1.f(f4i1.c(i, "unexpected port: "));
        } else {
            this.e = i;
        }
    }

    public final void h(int i, int i2, String str, boolean z, boolean z2) {
        String strI = mno1.i(i, i2, 112, str, " \"<>^`{}|/\\?#", z2);
        if (strI.equals(".") || strI.equalsIgnoreCase("%2e")) {
            return;
        }
        boolean zEquals = strI.equals("..");
        ArrayList arrayList = this.f;
        if (zEquals || strI.equalsIgnoreCase("%2e.") || strI.equalsIgnoreCase(".%2e") || strI.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) l1d.i(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strI);
        } else {
            arrayList.add(strI);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public final void i(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.a = "http";
        } else if (str.equalsIgnoreCase(m3i1.b)) {
            this.a = m3i1.b;
        } else {
            hhg1.n("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056 A[LOOP:0: B:7:0x0024->B:13:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[EDGE_INSN: B:17:0x0059->B:14:0x0059 BREAK  A[LOOP:0: B:7:0x0024->B:13:0x0056], SYNTHETIC] */
    public final void j(String str, String str2) {
        String str3;
        if (this.g != null) {
            str3 = str;
            String strI = mno1.i(0, 0, 91, str3, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false);
            ArrayList arrayList = this.g;
            arrayList.getClass();
            int size = arrayList.size() - 2;
            int iA = bmq0.A(size, 0, -2);
            if (iA <= size) {
                while (true) {
                    ArrayList arrayList2 = this.g;
                    arrayList2.getClass();
                    if (!strI.equals(arrayList2.get(size))) {
                        if (size != iA) {
                            break;
                            break;
                        }
                        size -= 2;
                    } else {
                        ArrayList arrayList3 = this.g;
                        arrayList3.getClass();
                        arrayList3.remove(size + 1);
                        ArrayList arrayList4 = this.g;
                        arrayList4.getClass();
                        arrayList4.remove(size);
                        ArrayList arrayList5 = this.g;
                        arrayList5.getClass();
                        if (!arrayList5.isEmpty()) {
                            if (size != iA) {
                                break;
                            } else {
                                size -= 2;
                            }
                        } else {
                            this.g = null;
                            break;
                        }
                    }
                }
            }
        } else {
            str3 = str;
        }
        a(str3, str2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (ihc1.i0(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int iC = c();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iC);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals(m3i1.b)) {
                    i = 443;
                }
                if (iC != i) {
                    sb.append(':');
                    sb.append(iC);
                }
            }
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            fc11.l0(sb, arrayList2);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
