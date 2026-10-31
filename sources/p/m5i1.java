package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m5i1 implements r5i1 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public m5i1(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5i1)) {
            return false;
        }
        m5i1 m5i1Var = (m5i1) obj;
        return u890.j(this.a, m5i1Var.a) && u890.j(this.b, m5i1Var.b) && this.c.equals(m5i1Var.c) && u890.j(this.d, m5i1Var.d) && u890.j(this.e, m5i1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iB = f4i1.b(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }
}
