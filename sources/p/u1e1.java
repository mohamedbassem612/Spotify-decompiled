package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u1e1 {
    public final String a;
    public final List b;
    public final Long c;
    public final s1e1 d;

    public u1e1(String str, List list, Long l, s1e1 s1e1Var) {
        this.a = str;
        this.b = list;
        this.c = l;
        this.d = s1e1Var;
    }

    public static u1e1 a(u1e1 u1e1Var, s1e1 s1e1Var) {
        return new u1e1(u1e1Var.a, u1e1Var.b, u1e1Var.c, s1e1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1e1)) {
            return false;
        }
        u1e1 u1e1Var = (u1e1) obj;
        return this.a.equals(u1e1Var.a) && this.b.equals(u1e1Var.b) && u890.j(this.c, u1e1Var.c) && u890.j(this.d, u1e1Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return this.d.hashCode() + ((iB + (l == null ? 0 : l.hashCode())) * 31);
    }
}
