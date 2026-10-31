package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rkc extends jlc {
    public final Set a;
    public final gmc b;
    public final List c;
    public final Map d;

    public rkc(Set set, gmc gmcVar, List list, Map map) {
        this.a = set;
        this.b = gmcVar;
        this.c = list;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkc)) {
            return false;
        }
        rkc rkcVar = (rkc) obj;
        return this.a.equals(rkcVar.a) && this.b.equals(rkcVar.b) && u890.j(this.c, rkcVar.c) && u890.j(this.d, rkcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
