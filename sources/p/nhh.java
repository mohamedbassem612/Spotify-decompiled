package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nhh {
    public final jo70 a;
    public final xkk1 b;
    public final List c;

    public nhh(List list, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhh)) {
            return false;
        }
        nhh nhhVar = (nhh) obj;
        return u890.j(this.a, nhhVar.a) && u890.j(this.b, nhhVar.b) && this.c.equals(nhhVar.c);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return this.c.hashCode() + ((iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0)) * 31);
    }
}
