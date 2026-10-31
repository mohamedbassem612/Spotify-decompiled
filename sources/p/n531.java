package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n531 {
    public final String a;
    public final String b;
    public final q431 c;
    public final List d;
    public final b631 e;
    public final String f;
    public final String g;

    public n531(String str, String str2, q431 q431Var, List list, b631 b631Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = q431Var;
        this.d = list;
        this.e = b631Var;
        this.f = str3;
        this.g = str4;
    }

    public static n531 a(n531 n531Var, q431 q431Var, String str, int i) {
        String str2 = n531Var.a;
        String str3 = n531Var.b;
        if ((i & 4) != 0) {
            q431Var = n531Var.c;
        }
        q431 q431Var2 = q431Var;
        List list = n531Var.d;
        b631 b631Var = n531Var.e;
        String str4 = n531Var.f;
        if ((i & 64) != 0) {
            str = n531Var.g;
        }
        n531Var.getClass();
        return new n531(str2, str3, q431Var2, list, b631Var, str4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n531)) {
            return false;
        }
        n531 n531Var = (n531) obj;
        return this.a.equals(n531Var.a) && this.b.equals(n531Var.b) && u890.j(this.c, n531Var.c) && this.d.equals(n531Var.d) && this.e.equals(n531Var.e) && u890.j(this.f, n531Var.f) && u890.j(this.g, n531Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        q431 q431Var = this.c;
        int iHashCode = (this.e.hashCode() + f4i1.b((iD + (q431Var == null ? 0 : q431Var.hashCode())) * 31, 31, this.d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
