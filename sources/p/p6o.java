package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6o {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public p6o(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6o)) {
            return false;
        }
        p6o p6oVar = (p6o) obj;
        return this.a.equals(p6oVar.a) && this.b.equals(p6oVar.b) && this.c.equals(p6oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
