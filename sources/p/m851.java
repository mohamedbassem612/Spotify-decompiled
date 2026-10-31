package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m851 {
    public final c481 a;
    public final n6v0 b;
    public final boolean c;
    public final n131 d;
    public final Set e;

    public m851(c481 c481Var, n6v0 n6v0Var, boolean z, n131 n131Var, Set set) {
        this.a = c481Var;
        this.b = n6v0Var;
        this.c = z;
        this.d = n131Var;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m851)) {
            return false;
        }
        m851 m851Var = (m851) obj;
        return u890.j(this.a, m851Var.a) && this.b.equals(m851Var.b) && this.c == m851Var.c && this.d.equals(m851Var.d) && this.e.equals(m851Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }
}
