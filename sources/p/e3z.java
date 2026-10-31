package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661(with = f3z.class)
public final class e3z {
    public static final d3z Companion = new d3z();
    public final aqa0 a;
    public final List b;
    public final Map c;

    public e3z(aqa0 aqa0Var, List list, Map map) {
        this.a = aqa0Var;
        this.b = list;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3z)) {
            return false;
        }
        e3z e3zVar = (e3z) obj;
        return u890.j(this.a, e3zVar.a) && u890.j(this.b, e3zVar.b) && u890.j(this.c, e3zVar.c);
    }

    public final int hashCode() {
        aqa0 aqa0Var = this.a;
        int iHashCode = (aqa0Var == null ? 0 : aqa0Var.a.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
