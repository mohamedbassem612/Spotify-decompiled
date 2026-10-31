package p;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uel {
    public final yel a;
    public final List b;
    public final Set c;
    public final Set d;
    public final boolean e;

    public /* synthetic */ uel(yel yelVar, List list, Set set, Set set2, int i) {
        this(yelVar, list, set, (i & 8) != 0 ? w7x.a : set2, false);
    }

    public static uel a(uel uelVar, List list, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        yel yelVar = uelVar.a;
        if ((i & 2) != 0) {
            list = uelVar.b;
        }
        List list2 = list;
        Set set = linkedHashSet;
        if ((i & 4) != 0) {
            set = uelVar.c;
        }
        Set set2 = set;
        Set set3 = linkedHashSet2;
        if ((i & 8) != 0) {
            set3 = uelVar.d;
        }
        return new uel(yelVar, list2, set2, set3, (i & 16) != 0 ? uelVar.e : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uel)) {
            return false;
        }
        uel uelVar = (uel) obj;
        return u890.j(this.a, uelVar.a) && u890.j(this.b, uelVar.b) && u890.j(this.c, uelVar.c) && u890.j(this.d, uelVar.d) && this.e == uelVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gvg.c(gvg.c(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public uel(yel yelVar, List list, Set set, Set set2, boolean z) {
        this.a = yelVar;
        this.b = list;
        this.c = set;
        this.d = set2;
        this.e = z;
    }
}
