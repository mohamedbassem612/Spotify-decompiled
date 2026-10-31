package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pey {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final Set e;

    public pey(boolean z, boolean z2, List list, boolean z3, Set set) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pey)) {
            return false;
        }
        pey peyVar = (pey) obj;
        return this.a == peyVar.a && this.b == peyVar.b && u890.j(this.c, peyVar.c) && this.d == peyVar.d && this.e.equals(peyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(f4i1.b(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
