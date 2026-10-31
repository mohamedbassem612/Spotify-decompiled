package p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a7h1 implements eri1, Serializable {
    public static final a7h1 f;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;

    static {
        new m4c((byte) 28);
        f = new a7h1("", null, null, null, null);
    }

    public a7h1(String str, String str2, Integer num, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
    }

    @Override // p.eri1
    public final List a() {
        return this.a.length() == 0 ? k4p1.x("empty path node name") : z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a7h1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a7h1 a7h1Var = (a7h1) obj;
        return u890.j(this.a, a7h1Var.a) && u890.j(this.b, a7h1Var.b) && u890.j(this.c, a7h1Var.c) && u890.j(this.d, a7h1Var.d) && u890.j(this.e, a7h1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        String str3 = this.e;
        return iIntValue + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.e;
        Integer num = this.d;
        String str3 = this.c;
        String str4 = this.b;
        if (str4 == null && str3 == null && num == null && str2 == null) {
            return str;
        }
        StringBuilder sbG = dv20.g(str, "(");
        boolean zI = m4c.i(sbG, "id", str4, false);
        boolean zI2 = zI & m4c.i(sbG, "uri", str3, zI);
        m4c.i(sbG, "reason", str2, zI2 & m4c.i(sbG, "pos", num, zI2));
        sbG.append(")");
        return sbG.toString();
    }
}
