package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a6e {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;

    public a6e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((nqj0) obj).b instanceof xoj0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((nqj0) obj2).b instanceof xoj0)) {
                arrayList3.add(obj2);
            }
        }
        this.a = arrayList2;
        this.b = arrayList3;
        this.c = arrayList;
        this.d = !arrayList3.isEmpty();
    }

    public final List a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6e)) {
            return false;
        }
        a6e a6eVar = (a6e) obj;
        return this.a.equals(a6eVar.a) && this.b.equals(a6eVar.b) && this.c.equals(a6eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
