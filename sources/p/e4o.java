package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e4o {
    public final List a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public e4o(List list, String str, List list2, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4o)) {
            return false;
        }
        e4o e4oVar = (e4o) obj;
        return u890.j(this.a, e4oVar.a) && u890.j(this.b, e4oVar.b) && u890.j(this.c, e4oVar.c) && this.d == e4oVar.d && this.e == e4oVar.e && this.f == e4oVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
