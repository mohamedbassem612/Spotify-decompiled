package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m9a1 {
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;

    public m9a1(String str, List list, String str2, boolean z, String str3, boolean z2, String str4, int i) {
        str2 = (i & 4) != 0 ? "" : str2;
        z = (i & 8) != 0 ? false : z;
        str3 = (i & 16) != 0 ? null : str3;
        z2 = (i & 32) != 0 ? false : z2;
        str4 = (i & 64) != 0 ? null : str4;
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9a1)) {
            return false;
        }
        m9a1 m9a1Var = (m9a1) obj;
        return this.a.equals(m9a1Var.a) && u890.j(this.b, m9a1Var.b) && this.c.equals(m9a1Var.c) && this.d == m9a1Var.d && u890.j(this.e, m9a1Var.e) && this.f == m9a1Var.f && u890.j(this.g, m9a1Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iG2 = xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }
}
