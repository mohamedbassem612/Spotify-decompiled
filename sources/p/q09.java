package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q09 {
    public final n3d1 a;
    public final n3d1 b;
    public final ArrayList c;

    public q09(n3d1 n3d1Var, n3d1 n3d1Var2, ArrayList arrayList) {
        if (n3d1Var == null) {
            bhn0.i("Null primarySurfaceEdge");
            throw null;
        }
        this.a = n3d1Var;
        if (n3d1Var2 == null) {
            bhn0.i("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = n3d1Var2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q09)) {
            return false;
        }
        q09 q09Var = (q09) obj;
        return this.a.equals(q09Var.a) && this.b.equals(q09Var.b) && this.c.equals(q09Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
