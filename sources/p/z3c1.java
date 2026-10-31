package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3c1 {
    public final List a;
    public final String b;
    public final y3c1 c;

    public z3c1(List list, String str, y3c1 y3c1Var) {
        this.a = list;
        this.b = str;
        this.c = y3c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3c1)) {
            return false;
        }
        z3c1 z3c1Var = (z3c1) obj;
        return this.a.equals(z3c1Var.a) && u890.j(this.b, z3c1Var.b) && this.c.equals(z3c1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
