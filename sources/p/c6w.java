package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c6w {
    public final List a;
    public final jo70 b;
    public final xkk1 c;

    public c6w(List list, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = list;
        this.b = jo70Var;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6w)) {
            return false;
        }
        c6w c6wVar = (c6w) obj;
        return this.a.equals(c6wVar.a) && u890.j(this.b, c6wVar.b) && u890.j(this.c, c6wVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
