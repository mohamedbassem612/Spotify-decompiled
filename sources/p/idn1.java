package p;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class idn1 extends ldp1 {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final hdn1 c;
    public final gdn1 d;

    public idn1(int i, BigInteger bigInteger, hdn1 hdn1Var, gdn1 gdn1Var) {
        this.a = i;
        this.b = bigInteger;
        this.c = hdn1Var;
        this.d = gdn1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof idn1)) {
            return false;
        }
        idn1 idn1Var = (idn1) obj;
        return idn1Var.a == this.a && Objects.equals(idn1Var.b, this.b) && idn1Var.c == this.c && idn1Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(idn1.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        bb00.j(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
