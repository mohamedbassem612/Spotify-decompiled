package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h3t {
    public final g3t a;
    public final List b;
    public final nsn0 c;

    public h3t(g3t g3tVar, List list, nsn0 nsn0Var) {
        this.a = g3tVar;
        this.b = list;
        this.c = nsn0Var;
    }

    public final nsn0 a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }

    public final g3t c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3t)) {
            return false;
        }
        h3t h3tVar = (h3t) obj;
        return this.a.equals(h3tVar.a) && this.b.equals(h3tVar.b) && u890.j(this.c, h3tVar.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        nsn0 nsn0Var = this.c;
        return iB + (nsn0Var == null ? 0 : nsn0Var.hashCode());
    }
}
