package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g2g {
    public final v3h1 a;
    public final ArrayList b;
    public final int c;

    public g2g(v3h1 v3h1Var, ArrayList arrayList, int i) {
        this.a = v3h1Var;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2g)) {
            return false;
        }
        g2g g2gVar = (g2g) obj;
        return this.a.equals(g2gVar.a) && this.b.equals(g2gVar.b) && this.c == g2gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
