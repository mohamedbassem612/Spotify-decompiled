package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wv6 {
    public final ArrayList a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final ArrayList g;

    public wv6(ArrayList arrayList, List list, List list2, ArrayList arrayList2, int i, int i2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = list;
        this.c = list2;
        this.d = arrayList2;
        this.e = i;
        this.f = i2;
        this.g = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv6)) {
            return false;
        }
        wv6 wv6Var = (wv6) obj;
        return this.a.equals(wv6Var.a) && this.b.equals(wv6Var.b) && u890.j(this.c, wv6Var.c) && this.d.equals(wv6Var.d) && this.e == wv6Var.e && this.f == wv6Var.f && this.g.equals(wv6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(this.f, kaa0.f(this.e, p3d1.f(this.d, f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }
}
