package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oom0 implements qom0 {
    public final boolean a;
    public final ArrayList b;
    public final Map c;

    public oom0(ArrayList arrayList, Map map, boolean z) {
        this.a = z;
        this.b = arrayList;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oom0)) {
            return false;
        }
        oom0 oom0Var = (oom0) obj;
        return this.a == oom0Var.a && this.b.equals(oom0Var.b) && u890.j(this.c, oom0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
