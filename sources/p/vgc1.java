package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class vgc1 extends y6 {
    public final String g;

    public vgc1(String str, vfa0 vfa0Var) {
        super(vfa0Var);
        this.g = str;
    }

    public final String A(String str, boolean z) {
        int i = ((y6) this).b;
        try {
            if (i() == 6 && u890.j(C(z), str)) {
                r();
                if (i() == 5) {
                    return C(z);
                }
            }
            return null;
        } finally {
            ((y6) this).b = i;
            r();
        }
    }

    public final int D(int i) {
        if (i < this.g.length()) {
            return i;
        }
        return -1;
    }

    public int G() {
        char cCharAt;
        int i = ((y6) this).b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.g;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        ((y6) this).b = i;
        return i;
    }

    public boolean e() {
        int i = ((y6) this).b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.g;
            if (i >= str.length()) {
                ((y6) this).b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                ((y6) this).b = i;
                return y6.z(cCharAt);
            }
            i++;
        }
    }

    public final String h() {
        k('\"');
        int i = ((y6) this).b;
        String str = this.g;
        int iV0 = ihc1.v0(str, '\"', i, 4);
        if (iV0 == -1) {
            p();
            String strV = cto1.v((byte) 1);
            int i2 = ((y6) this).b;
            y6.v(this, cy30.p("Expected ", strV, ", but had '", (i2 == ((String) y6.a(this)).length() || i2 < 0) ? "EOF" : String.valueOf(((String) y6.a(this)).charAt(i2)), "' instead"), i2, (String) null, 4);
            throw null;
        }
        for (int i3 = i; i3 < iV0; i3++) {
            if (str.charAt(i3) == '\\') {
                return o(((y6) this).b, i3, str);
            }
        }
        ((y6) this).b = iV0 + 1;
        return str.substring(i, iV0);
    }

    public byte i() {
        String str;
        int i = ((y6) this).b;
        while (true) {
            str = this.g;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                ((y6) this).b = i2;
                return cto1.m(cCharAt);
            }
            i = i2;
        }
        ((y6) this).b = str.length();
        return (byte) 10;
    }

    public void k(char c) {
        int i = ((y6) this).b;
        if (i == -1) {
            L(c);
            throw null;
        }
        while (true) {
            String str = this.g;
            if (i >= str.length()) {
                ((y6) this).b = -1;
                L(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                ((y6) this).b = i2;
                if (cCharAt == c) {
                    return;
                }
                L(c);
                throw null;
            }
            i = i2;
        }
    }

    public final CharSequence y() {
        return this.g;
    }
}
