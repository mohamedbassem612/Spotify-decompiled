package p;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wdn1 extends ldp1 {
    public static final BigInteger g = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final vdn1 c;
    public final udn1 d;
    public final udn1 e;
    public final int f;

    public wdn1(int i, BigInteger bigInteger, vdn1 vdn1Var, udn1 udn1Var, udn1 udn1Var2, int i2) {
        this.a = i;
        this.b = bigInteger;
        this.c = vdn1Var;
        this.d = udn1Var;
        this.e = udn1Var2;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wdn1)) {
            return false;
        }
        wdn1 wdn1Var = (wdn1) obj;
        return wdn1Var.a == this.a && Objects.equals(wdn1Var.b, this.b) && wdn1Var.c == this.c && wdn1Var.d == this.d && wdn1Var.e == this.e && wdn1Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(wdn1.class, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        bb00.j(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
