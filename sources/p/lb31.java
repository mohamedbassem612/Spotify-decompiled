package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lb31 implements pb31 {
    public final String a;
    public final vbe b;
    public final List c;
    public final ega1 d;
    public final boolean e;
    public final km90 f;
    public final km90 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public lb31(String str, vbe vbeVar, List list, ega1 ega1Var, boolean z, km90 km90Var, km90 km90Var2, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = vbeVar;
        this.c = list;
        this.d = ega1Var;
        this.e = z;
        this.f = km90Var;
        this.g = km90Var2;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        if ((km90Var instanceof jm90) || !z) {
            return;
        }
        hhg1.n("hasMoreItems must be false once the whole list is loaded");
        throw null;
    }

    public static lb31 f(lb31 lb31Var, vbe vbeVar, ega1 ega1Var, km90 km90Var, int i) {
        String str = lb31Var.a;
        if ((i & 2) != 0) {
            vbeVar = lb31Var.b;
        }
        vbe vbeVar2 = vbeVar;
        List list = lb31Var.c;
        if ((i & 8) != 0) {
            ega1Var = lb31Var.d;
        }
        ega1 ega1Var2 = ega1Var;
        boolean z = lb31Var.e;
        km90 km90Var2 = lb31Var.f;
        if ((i & 64) != 0) {
            km90Var = lb31Var.g;
        }
        return new lb31(str, vbeVar2, list, ega1Var2, z, km90Var2, km90Var, (i & 128) != 0 ? lb31Var.h : false, lb31Var.i, lb31Var.j);
    }

    public final boolean a() {
        return this.i;
    }

    public final vbe b() {
        return this.b;
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb31)) {
            return false;
        }
        lb31 lb31Var = (lb31) obj;
        return u890.j(this.a, lb31Var.a) && u890.j(this.b, lb31Var.b) && u890.j(this.c, lb31Var.c) && u890.j(this.d, lb31Var.d) && this.e == lb31Var.e && u890.j(this.f, lb31Var.f) && u890.j(this.g, lb31Var.g) && this.h == lb31Var.h && this.i == lb31Var.i && this.j == lb31Var.j;
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + xcg1.g((this.d.hashCode() + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e)) * 31;
        km90 km90Var = this.g;
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g((iHashCode + (km90Var == null ? 0 : km90Var.hashCode())) * 31, 31, this.h), 31, this.i);
    }

    public /* synthetic */ lb31(String str, vbe vbeVar, List list, ega1 ega1Var, boolean z, km90 km90Var, boolean z2, boolean z3, boolean z4, int i) {
        this(str, vbeVar, list, ega1Var, (i & 16) != 0 ? false : z, km90Var, (km90) null, (i & 128) != 0 ? false : z2, z3, z4);
    }
}
