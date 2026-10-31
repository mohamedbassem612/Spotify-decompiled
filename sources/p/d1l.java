package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d1l {
    public final List a;
    public final boolean b;
    public final List c;
    public final List d;

    public d1l(List list, List list2, List list3, boolean z) {
        this.a = list;
        this.b = z;
        this.c = list2;
        this.d = list3;
    }

    public static d1l a(d1l d1lVar, ArrayList arrayList, boolean z, ArrayList arrayList2, List list, int i) {
        List list2 = arrayList;
        if ((i & 1) != 0) {
            list2 = d1lVar.a;
        }
        if ((i & 2) != 0) {
            z = d1lVar.b;
        }
        List list3 = arrayList2;
        if ((i & 4) != 0) {
            list3 = d1lVar.c;
        }
        if ((i & 8) != 0) {
            list = d1lVar.d;
        }
        return new d1l(list2, list3, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1l)) {
            return false;
        }
        d1l d1lVar = (d1l) obj;
        return u890.j(this.a, d1lVar.a) && this.b == d1lVar.b && u890.j(this.c, d1lVar.c) && u890.j(this.d, d1lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
