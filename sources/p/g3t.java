package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g3t {
    public final gwn0 a;
    public final myn0 b;
    public final List c;
    public nsn0 d;

    public g3t(gwn0 gwn0Var, myn0 myn0Var, List list, nsn0 nsn0Var) {
        this.a = gwn0Var;
        this.b = myn0Var;
        this.c = list;
        this.d = nsn0Var;
    }

    public final myn0 a() {
        return this.b;
    }

    public final gwn0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3t)) {
            return false;
        }
        g3t g3tVar = (g3t) obj;
        return u890.j(this.a, g3tVar.a) && u890.j(this.b, g3tVar.b) && u890.j(this.c, g3tVar.c) && u890.j(this.d, g3tVar.d);
    }

    public final int hashCode() {
        int iB = f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        nsn0 nsn0Var = this.d;
        return iB + (nsn0Var == null ? 0 : nsn0Var.hashCode());
    }

    public /* synthetic */ g3t(gwn0 gwn0Var, myn0 myn0Var) {
        this(gwn0Var, myn0Var, new ArrayList(), null);
    }
}
