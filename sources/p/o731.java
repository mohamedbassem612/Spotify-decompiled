package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o731 {
    public final Map a;
    public final Set b;
    public final Map c;
    public final Map d;
    public final Set e;

    public o731(Map map, Set set, Map map2, Map map3, Set set2) {
        this.a = map;
        this.b = set;
        this.c = map2;
        this.d = map3;
        this.e = set2;
    }

    public static o731 a(o731 o731Var, LinkedHashMap linkedHashMap, Set set, Map map, Map map2, LinkedHashSet linkedHashSet, int i) {
        Map map3 = linkedHashMap;
        if ((i & 1) != 0) {
            map3 = o731Var.a;
        }
        Map map4 = map3;
        if ((i & 2) != 0) {
            set = o731Var.b;
        }
        Set set2 = set;
        if ((i & 4) != 0) {
            map = o731Var.c;
        }
        Map map5 = map;
        if ((i & 8) != 0) {
            map2 = o731Var.d;
        }
        Map map6 = map2;
        Set set3 = linkedHashSet;
        if ((i & 16) != 0) {
            set3 = o731Var.e;
        }
        return new o731(map4, set2, map5, map6, set3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o731)) {
            return false;
        }
        o731 o731Var = (o731) obj;
        return u890.j(this.a, o731Var.a) && u890.j(this.b, o731Var.b) && u890.j(this.c, o731Var.c) && u890.j(this.d, o731Var.d) && u890.j(this.e, o731Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.e(cy30.e(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o731() {
        w7x w7xVar = w7x.a;
        b7x b7xVar = b7x.a;
        this(b7xVar, w7xVar, b7xVar, b7xVar, w7xVar);
    }
}
