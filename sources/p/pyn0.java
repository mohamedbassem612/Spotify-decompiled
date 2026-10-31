package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pyn0 implements ryn0 {
    public final UUID a;
    public final bzn0 b;
    public final List c;
    public final Map d;

    public pyn0(UUID uuid, bzn0 bzn0Var, List list, Map map) {
        this.a = uuid;
        this.b = bzn0Var;
        this.c = list;
        this.d = map;
    }

    public static pyn0 a(pyn0 pyn0Var, ArrayList arrayList, Map map, int i) {
        UUID uuid = pyn0Var.a;
        bzn0 bzn0Var = pyn0Var.b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = pyn0Var.c;
        }
        if ((i & 8) != 0) {
            map = pyn0Var.d;
        }
        return new pyn0(uuid, bzn0Var, list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyn0)) {
            return false;
        }
        pyn0 pyn0Var = (pyn0) obj;
        return this.a.equals(pyn0Var.a) && this.b.equals(pyn0Var.b) && this.c.equals(pyn0Var.c) && u890.j(this.d, pyn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
