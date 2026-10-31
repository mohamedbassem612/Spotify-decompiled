package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lbe {
    public static final lbe c = new lbe(o7h.p1(new ArrayList()), null);
    public final Set a;
    public final anm1 b;

    public lbe(Set set, anm1 anm1Var) {
        this.a = set;
        this.b = anm1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lbe)) {
            return false;
        }
        lbe lbeVar = (lbe) obj;
        return lbeVar.a.equals(this.a) && u890.j(lbeVar.b, this.b);
    }

    public final int hashCode() {
        int iC = gvg.c(1517, 41, this.a);
        anm1 anm1Var = this.b;
        return iC + (anm1Var != null ? anm1Var.hashCode() : 0);
    }
}
