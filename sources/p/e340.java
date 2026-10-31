package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e340 {
    public final String a;
    public final List b;
    public final List c;
    public final int d;
    public final int e;
    public final long f;
    public final n5r0 g;
    public final long h;
    public final List i;

    public e340(String str, List list, List list2, int i, int i2, long j, n5r0 n5r0Var, long j2, List list3) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = n5r0Var;
        this.h = j2;
        this.i = list3;
    }

    public static e340 a(e340 e340Var, int i, int i2, long j, ArrayList arrayList, int i3) {
        String str = e340Var.a;
        List list = e340Var.b;
        List list2 = e340Var.c;
        if ((i3 & 8) != 0) {
            i = e340Var.d;
        }
        return new e340(str, list, list2, i, i2, (i3 & 32) != 0 ? e340Var.f : j, e340Var.g, e340Var.h, (i3 & 256) != 0 ? e340Var.i : arrayList);
    }

    public final l1z0 b() {
        return (l1z0) this.b.get(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e340)) {
            return false;
        }
        e340 e340Var = (e340) obj;
        return u890.j(this.a, e340Var.a) && this.b.equals(e340Var.b) && this.c.equals(e340Var.c) && this.d == e340Var.d && this.e == e340Var.e && this.f == e340Var.f && this.g.equals(e340Var.g) && this.h == e340Var.h && u890.j(this.i, e340Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.f((this.g.hashCode() + cy30.f(ab80.k(this.e, kaa0.f(this.d, f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), this.f, 31)) * 31, this.h, 31);
    }
}
