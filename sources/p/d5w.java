package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d5w {
    public final String a;
    public final List b;
    public final x4i1 c;

    public d5w(String str, List list, x4i1 x4i1Var) {
        this.a = str;
        this.b = list;
        this.c = x4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5w)) {
            return false;
        }
        d5w d5wVar = (d5w) obj;
        return u890.j(this.a, d5wVar.a) && this.b.equals(d5wVar.b) && u890.j(this.c, d5wVar.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        x4i1 x4i1Var = this.c;
        return iB + (x4i1Var == null ? 0 : x4i1Var.hashCode());
    }
}
