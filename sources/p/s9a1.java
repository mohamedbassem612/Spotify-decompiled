package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s9a1 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final qtt0 f;
    public final String g;
    public final String h;

    public s9a1(String str, String str2, List list, String str3, int i, qtt0 qtt0Var, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = i;
        this.f = qtt0Var;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9a1)) {
            return false;
        }
        s9a1 s9a1Var = (s9a1) obj;
        return u890.j(this.a, s9a1Var.a) && u890.j(this.b, s9a1Var.b) && this.c.equals(s9a1Var.c) && u890.j(this.d, s9a1Var.d) && this.e == s9a1Var.e && this.f == s9a1Var.f && u890.j(this.g, s9a1Var.g) && u890.j(this.h, s9a1Var.h);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD = cy30.d((this.f.hashCode() + ab80.k(this.e, (iB + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.g);
        String str2 = this.h;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
