package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sll1 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final izr0 a = new izr0();
    public final StringBuilder b = new StringBuilder();

    public static String a(izr0 izr0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = izr0Var.b;
        int i2 = izr0Var.c;
        while (i < i2 && !z) {
            char c2 = (char) izr0Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        izr0Var.S(i - izr0Var.b);
        return sb.toString();
    }

    public static String b(izr0 izr0Var, StringBuilder sb) {
        c(izr0Var);
        if (izr0Var.a() == 0) {
            return null;
        }
        String strA = a(izr0Var, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) izr0Var.E());
    }

    public static void c(izr0 izr0Var) {
        while (true) {
            for (boolean z = true; izr0Var.a() > 0 && z; z = false) {
                int i = izr0Var.b;
                byte[] bArr = izr0Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    izr0Var.S(1);
                } else {
                    int i2 = izr0Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            izr0Var.S(i2 - izr0Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
