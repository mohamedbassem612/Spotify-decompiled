package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pfl {
    public final int a;
    public final ifl b;
    public final ArrayList c;
    public final ArrayList d;

    public pfl(int i, ifl iflVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.b = iflVar;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfl)) {
            return false;
        }
        pfl pflVar = (pfl) obj;
        return this.a == pflVar.a && this.b == pflVar.b && this.c.equals(pflVar.c) && this.d.equals(pflVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, (this.b.hashCode() + (l1d.C(this.a) * 31)) * 31, 31);
    }
}
