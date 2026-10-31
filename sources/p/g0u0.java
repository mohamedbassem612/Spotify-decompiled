package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g0u0 {
    public final k650 a;
    public final l650 b;
    public final ArrayList c;
    public final ArrayList d;

    public g0u0(k650 k650Var, l650 l650Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = k650Var;
        this.b = l650Var;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0u0)) {
            return false;
        }
        g0u0 g0u0Var = (g0u0) obj;
        return this.a.equals(g0u0Var.a) && this.b == g0u0Var.b && this.c.equals(g0u0Var.c) && this.d.equals(g0u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
