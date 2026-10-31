package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v1j0 implements w1j0 {
    public final String a;
    public final String b;
    public final String c;
    public final w4i1 d;
    public final long e;
    public final t1j0 f;
    public final j1j0 g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final List k;

    public v1j0(String str, String str2, String str3, w4i1 w4i1Var, long j, t1j0 t1j0Var, j1j0 j1j0Var, List list, boolean z, boolean z2, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w4i1Var;
        this.e = j;
        this.f = t1j0Var;
        this.g = j1j0Var;
        this.h = list;
        this.i = z;
        this.j = z2;
        this.k = list2;
    }

    @Override // p.w1j0
    public final List a() {
        return this.h;
    }

    @Override // p.w1j0
    public final long b() {
        return this.e;
    }

    @Override // p.w1j0
    public final boolean c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1j0)) {
            return false;
        }
        v1j0 v1j0Var = (v1j0) obj;
        return u890.j(this.a, v1j0Var.a) && u890.j(this.b, v1j0Var.b) && u890.j(this.c, v1j0Var.c) && u890.j(this.d, v1j0Var.d) && this.e == v1j0Var.e && u890.j(this.f, v1j0Var.f) && u890.j(this.g, v1j0Var.g) && u890.j(this.h, v1j0Var.h) && this.i == v1j0Var.i && this.j == v1j0Var.j && u890.j(this.k, v1j0Var.k);
    }

    public final String getId() {
        return this.b;
    }

    @Override // p.w1j0
    public final j1j0 getModerationStatus() {
        return this.g;
    }

    @Override // p.w1j0
    public final w4i1 getSender() {
        return this.d;
    }

    @Override // p.w1j0
    public final t1j0 getState() {
        return this.f;
    }

    public final int hashCode() {
        return this.k.hashCode() + xcg1.g(xcg1.g(f4i1.b((this.g.hashCode() + ((this.f.hashCode() + cy30.f(ydh.d(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), this.e, 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public /* synthetic */ v1j0(String str, String str2, String str3, w4i1 w4i1Var, long j, t1j0 t1j0Var, j1j0 j1j0Var, List list, boolean z, List list2, int i) {
        this(str, str2, str3, w4i1Var, j, t1j0Var, j1j0Var, list, z, (i & 512) == 0, (i & 1024) != 0 ? z6x.a : list2);
    }
}
