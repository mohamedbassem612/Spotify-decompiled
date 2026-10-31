package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d6d {
    public final String a;
    public final x360 b;
    public final ArrayList c;
    public final n1x d;

    public d6d(String str, x360 x360Var, ArrayList arrayList, n1x n1xVar) {
        this.a = str;
        this.b = x360Var;
        this.c = arrayList;
        this.d = n1xVar;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6d)) {
            return false;
        }
        d6d d6dVar = (d6d) obj;
        return this.a.equals(d6dVar.a) && u890.j(this.b, d6dVar.b) && this.c.equals(d6dVar.c) && u890.j(this.d, d6dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        int iF = p3d1.f(this.c, (iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
        n1x n1xVar = this.d;
        return iF + (n1xVar != null ? n1xVar.hashCode() : 0);
    }
}
