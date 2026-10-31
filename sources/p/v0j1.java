package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0j1 implements x0j1 {
    public final String a;
    public final List b;
    public final u0j1 c;
    public final String d;
    public final long e;

    public v0j1(String str, List list, u0j1 u0j1Var, String str2, long j) {
        this.a = str;
        this.b = list;
        this.c = u0j1Var;
        this.d = str2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0j1)) {
            return false;
        }
        v0j1 v0j1Var = (v0j1) obj;
        return this.a.equals(v0j1Var.a) && this.b.equals(v0j1Var.b) && this.c.equals(v0j1Var.c) && this.d.equals(v0j1Var.d) && this.e == v0j1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.d((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
