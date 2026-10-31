package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aum0 implements bum0 {
    public final List a;
    public final List b;
    public final List c;
    public final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ aum0(List list, List list2, List list3, Map map, int i) {
        int i2 = i & 1;
        List list4 = z6x.a;
        this(i2 != 0 ? list4 : list, (i & 2) != 0 ? list4 : list2, (i & 4) != 0 ? list4 : list3, (i & 8) != 0 ? b7x.a : map);
    }

    public static aum0 a(aum0 aum0Var, List list, List list2, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            list = aum0Var.a;
        }
        if ((i & 2) != 0) {
            list2 = aum0Var.b;
        }
        List list3 = aum0Var.c;
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = aum0Var.d;
        }
        return new aum0(list, list2, list3, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aum0)) {
            return false;
        }
        aum0 aum0Var = (aum0) obj;
        return u890.j(this.a, aum0Var.a) && u890.j(this.b, aum0Var.b) && u890.j(this.c, aum0Var.c) && u890.j(this.d, aum0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public aum0(List list, List list2, List list3, Map map) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = map;
    }
}
