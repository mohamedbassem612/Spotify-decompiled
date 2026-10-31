package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fc71 {
    public final List a;
    public final List b;
    public final Map c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;

    public fc71(List list, List list2, Map map, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = linkedHashMap;
        this.e = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc71)) {
            return false;
        }
        fc71 fc71Var = (fc71) obj;
        return this.a.equals(fc71Var.a) && this.b.equals(fc71Var.b) && this.c.equals(fc71Var.c) && this.d.equals(fc71Var.d) && this.e.equals(fc71Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.e(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
