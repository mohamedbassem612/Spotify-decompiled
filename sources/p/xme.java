package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xme implements omv0 {
    public static xme a(String str) {
        int length = str.length();
        if (length == 0) {
            return ome.f;
        }
        if (length != 1) {
            return length != 2 ? new pme(str) : new sme(str.charAt(0), str.charAt(1));
        }
        return new rme(str.charAt(0), (byte) 0);
    }

    public static String g(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        dm5.u(i, length);
        while (i < length) {
            if (d(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int c(String str) {
        return b(str, 0);
    }

    public boolean d(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> wme.b) == c;
    }

    public xme e() {
        return new ume(this);
    }

    public String f(String str) {
        String string = str.toString();
        int iC = c(string);
        if (iC == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iC++;
            while (iC != charArray.length) {
                if (d(charArray[iC])) {
                    i++;
                } else {
                    charArray[iC - i] = charArray[iC];
                    iC++;
                }
            }
            return new String(charArray, 0, iC - i);
        }
    }
}
