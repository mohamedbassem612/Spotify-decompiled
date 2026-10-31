package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class y6 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public y6(dw91 dw91Var, Iterator it) {
        this.a = (byte) 1;
        this.c = dw91Var;
        this.d = it;
        this.b = dw91Var.b().e();
        b();
    }

    public static final CharSequence a(vgc1 vgc1Var) {
        return vgc1Var.g;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static /* synthetic */ void v(y6 y6Var, String str, int i, String str2, int i2) throws SerializationException {
        if ((i2 & 2) != 0) {
            i = y6Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        y6Var.u(i, str, str2);
        throw null;
    }

    public static boolean z(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public String A(String str, boolean z) {
        return null;
    }

    public byte B() {
        CharSequence charSequenceY = y();
        int i = this.b;
        while (true) {
            int iD = D(i);
            if (iD == -1) {
                this.b = iD;
                return (byte) 10;
            }
            char cCharAt = charSequenceY.charAt(iD);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iD;
                return cto1.m(cCharAt);
            }
            i = iD + 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public String C(boolean z) throws SerializationException {
        String strN;
        byte B = B();
        if (z) {
            if (B != 1 && B != 0) {
                return null;
            }
            strN = p();
        } else {
            if (B != 1) {
                return null;
            }
            strN = n();
        }
        this.e = strN;
        return strN;
    }

    public abstract int D(int i);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void E(boolean z) throws SerializationException {
        ArrayList arrayList = new ArrayList();
        byte B = B();
        if (B != 8 && B != 6) {
            p();
            return;
        }
        while (true) {
            byte B2 = B();
            if (B2 != 1) {
                if (B2 == 8 || B2 == 6) {
                    arrayList.add(Byte.valueOf(B2));
                } else if (B2 == 9) {
                    if (((Number) o7h.A0(arrayList)).byteValue() != 8) {
                        v(this, "found ] instead of }", 0, null, 6);
                        throw null;
                    }
                    r7h.d0(arrayList);
                } else if (B2 == 7) {
                    if (((Number) o7h.A0(arrayList)).byteValue() != 6) {
                        v(this, "found } instead of ]", 0, null, 6);
                        throw null;
                    }
                    r7h.d0(arrayList);
                } else if (B2 == 10) {
                    v(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                    throw null;
                }
                i();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                p();
            } else {
                h();
            }
        }
    }

    public abstract int G();

    public String H(int i, int i2) {
        return y().subSequence(i, i2).toString();
    }

    public boolean I() {
        int iG = G();
        CharSequence charSequenceY = y();
        if (iG >= charSequenceY.length() || iG == -1 || charSequenceY.charAt(iG) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean J(boolean z) {
        int iD = D(G());
        int length = y().length() - iD;
        if (length >= 4 && iD != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == y().charAt(iD + i)) {
                }
            }
            if (length <= 4 || cto1.m(y().charAt(iD + 4)) != 0) {
                if (z) {
                    this.b = iD + 4;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void L(char c) throws SerializationException {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strP = p();
                this.b = i;
                if (u890.j(strP, "null")) {
                    u(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strV = cto1.v(cto1.m(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        v(this, cy30.p("Expected ", strV, ", but had '", (i2 == y().length() || i3 < 0) ? "EOF" : String.valueOf(y().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public void b() {
        this.e = (Map.Entry) this.f;
        Iterator it = (Iterator) this.d;
        this.f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public int c(int i, CharSequence charSequence) throws SerializationException {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (x(i + 3, charSequence) + (x(i, charSequence) << 12) + (x(i + 1, charSequence) << 8) + (x(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        s();
        if (this.b + 4 < charSequence.length()) {
            return c(this.b, charSequence);
        }
        v(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void d(int i, int i2) {
        ((StringBuilder) this.f).append(y(), i, i2);
    }

    public abstract boolean e();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public boolean f() throws SerializationException {
        boolean z;
        boolean z2;
        int iG = G();
        if (iG == y().length()) {
            v(this, "EOF", 0, null, 6);
            throw null;
        }
        if (y().charAt(iG) == '\"') {
            iG++;
            z = true;
        } else {
            z = false;
        }
        int iD = D(iG);
        if (iD >= y().length() || iD == -1) {
            v(this, "EOF", 0, null, 6);
            throw null;
        }
        int i = iD + 1;
        int iCharAt = y().charAt(iD) | ' ';
        if (iCharAt == 102) {
            g(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                v(this, "Expected valid boolean literal prefix, but had '" + p() + '\'', 0, null, 6);
                throw null;
            }
            g(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (this.b == y().length()) {
            v(this, "EOF", 0, null, 6);
            throw null;
        }
        if (y().charAt(this.b) == '\"') {
            this.b++;
            return z2;
        }
        v(this, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void g(int i, String str) throws SerializationException {
        if (y().length() - i < str.length()) {
            v(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (y().charAt(i + i2) | ' ')) {
                v(this, "Expected valid boolean literal prefix, but had '" + p() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String h();

    public boolean hasNext() {
        return ((Map.Entry) this.f) != null;
    }

    public abstract byte i();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public byte j(byte b) throws SerializationException {
        byte bI = i();
        if (bI == b) {
            return bI;
        }
        String strV = cto1.v(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        v(this, cy30.p("Expected ", strV, ", but had '", (i == y().length() || i2 < 0) ? "EOF" : String.valueOf(y().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void k(char c);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public long l() throws SerializationException {
        boolean z;
        boolean z2;
        boolean z3;
        double dPow;
        int iD = D(G());
        if (iD >= y().length() || iD == -1) {
            v(this, "EOF", 0, null, 6);
            throw null;
        }
        if (y().charAt(iD) == '\"') {
            iD++;
            if (iD == y().length()) {
                v(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iD;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == y().length()) {
                z = z;
                z2 = z5;
                z3 = z6;
                break;
            }
            char cCharAt = y().charAt(i);
            z = z;
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z5;
                if (cCharAt == '-' && z2) {
                    if (i == iD) {
                        v(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z2) {
                    z3 = z6;
                    if (cCharAt != '-') {
                        if (cto1.m(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            v(this, cy30.l("Unexpected symbol '", cCharAt, "' in numeric literal"), i, null, 4);
                            throw null;
                        }
                        if (z2) {
                            j = (j * 10) + ((long) i3);
                        } else {
                            j2 = (j2 * 10) - ((long) i3);
                            if (j2 > 0) {
                                v(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z5 = z2;
                        z6 = z3;
                    } else {
                        if (i != iD) {
                            v(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z5 = z2;
                        z6 = true;
                    }
                } else {
                    if (i == iD) {
                        v(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = true;
                }
            } else {
                if (i == iD) {
                    v(this, cy30.l("Unexpected symbol '", cCharAt, "' in numeric literal"), i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iD;
        if (iD == i || (z3 && iD == i - 1)) {
            v(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z) {
            if (!z7) {
                v(this, "EOF", 0, null, 6);
                throw null;
            }
            if (y().charAt(i) != '\"') {
                v(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        if (z2) {
            double d = j2;
            if (!z4) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z4) {
                    eg.o();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                v(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                v(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z3) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        v(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public long m() throws SerializationException {
        long jL = l();
        if (i() == 10) {
            return jL;
        }
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        String str = ((vgc1) this).g;
        v(this, f4i1.f("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }

    public String n() {
        String str = (String) this.e;
        if (str == null) {
            return h();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public String o(int i, int i2, CharSequence charSequence) throws SerializationException {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                d(i, i2);
                int iD = D(i2 + 1);
                if (iD == -1) {
                    v(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iC = iD + 1;
                char cCharAt2 = y().charAt(iD);
                if (cCharAt2 == 'u') {
                    iC = c(iC, y());
                } else {
                    char c = cCharAt2 < 'u' ? mme.a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        v(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = D(iC);
                if (i == -1) {
                    v(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    d(i, i2);
                    i = D(i2);
                    if (i == -1) {
                        v(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i2);
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (z) {
            d(i, i2);
            string = sb.toString();
            sb.setLength(0);
        } else {
            string = H(i, i2);
        }
        this.b = i2 + 1;
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public String p() throws SerializationException {
        String strH;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.e;
        if (str != null) {
            str.getClass();
            this.e = null;
            return str;
        }
        int iG = G();
        if (iG >= y().length() || iG == -1) {
            v(this, "EOF", iG, null, 4);
            throw null;
        }
        byte bM = cto1.m(y().charAt(iG));
        if (bM == 1) {
            return n();
        }
        if (bM != 0) {
            v(this, "Expected beginning of the string, but got " + y().charAt(iG), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (cto1.m(y().charAt(iG)) == 0) {
            iG++;
            if (iG >= y().length()) {
                d(this.b, iG);
                int iD = D(iG);
                if (iD == -1) {
                    this.b = iG;
                    d(0, 0);
                    String string = sb.toString();
                    sb.setLength(0);
                    return string;
                }
                iG = iD;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            d(i, iG);
            String string2 = sb.toString();
            sb.setLength(0);
            strH = string2;
        } else {
            strH = H(i, iG);
        }
        this.b = iG;
        return strH;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public String q() throws SerializationException {
        String strP = p();
        if (!u890.j(strP, "null") || y().charAt(this.b - 1) == '\"') {
            return strP;
        }
        v(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void r() {
        this.e = null;
    }

    public void remove() {
        dw91 dw91Var = (dw91) this.c;
        if (dw91Var.b().e() != this.b) {
            eg.d();
            return;
        }
        Map.Entry entry = (Map.Entry) this.e;
        if (entry == null) {
            bhn0.w();
            return;
        }
        dw91Var.remove(entry.getKey());
        this.e = null;
        this.b = dw91Var.b().e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void t() throws SerializationException {
        if (i() == 10) {
            return;
        }
        v(this, "Expected EOF after parsing, but had " + y().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) y());
                sb.append("', currentPosition=");
                return l1d.o(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void u(int i, String str, String str2) throws SerializationException {
        throw new JsonDecodingException(vvm1.w(i, str, ((yga0) this.d).a(), str2, ((vfa0) this.c).m ? vvm1.C(i, y()).toString() : null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void w(String str) throws SerializationException {
        u(ihc1.B0(H(0, this.b), str, 0, 6), cy30.n("Encountered an unknown key '", str, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public int x(int i, CharSequence charSequence) throws SerializationException {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        v(this, cy30.l("Invalid toHexChar char '", cCharAt, "' in unicode escape"), 0, null, 6);
        throw null;
    }

    public abstract CharSequence y();

    public void s() {
    }

    public y6(vfa0 vfa0Var) {
        this.a = (byte) 0;
        this.c = vfa0Var;
        this.d = new yga0(vfa0Var);
        this.f = new StringBuilder();
    }
}
