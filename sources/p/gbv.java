package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gbv {
    public final lia1 a;
    public final ArrayList b;
    public final List c;
    public final boolean d;
    public final Set e;

    public gbv(lia1 lia1Var, ArrayList arrayList, List list, boolean z, Set set) {
        this.a = lia1Var;
        this.b = arrayList;
        this.c = list;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbv)) {
            return false;
        }
        gbv gbvVar = (gbv) obj;
        return this.a == gbvVar.a && this.b.equals(gbvVar.b) && this.c.equals(gbvVar.c) && this.d == gbvVar.d && u890.j(this.e, gbvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(f4i1.b(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
