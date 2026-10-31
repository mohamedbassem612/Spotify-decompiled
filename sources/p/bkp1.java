package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bkp1 extends ldp1 {
    public final zjp1 a;
    public final xjp1 b;
    public final yjp1 c;
    public final akp1 d;

    public bkp1(zjp1 zjp1Var, xjp1 xjp1Var, yjp1 yjp1Var, akp1 akp1Var) {
        this.a = zjp1Var;
        this.b = xjp1Var;
        this.c = yjp1Var;
        this.d = akp1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkp1)) {
            return false;
        }
        bkp1 bkp1Var = (bkp1) obj;
        return bkp1Var.a == this.a && bkp1Var.b == this.b && bkp1Var.c == this.c && bkp1Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(bkp1.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String str = this.d.b;
        int length = str.length();
        String str2 = this.c.b;
        int length2 = str2.length();
        String str3 = this.a.b;
        int length3 = str3.length();
        String str4 = this.b.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        bb00.j(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        bb00.j(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
