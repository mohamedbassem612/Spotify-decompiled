package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o1j0 implements w1j0 {
    public final apl a;
    public final String b;
    public final String c;
    public final w4i1 d;
    public final long e;
    public final j1j0 f;
    public final List g;
    public final t1j0 h;
    public final boolean i;
    public final List j;

    public o1j0(apl aplVar, String str, String str2, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z, List list2) {
        this.a = aplVar;
        this.b = str;
        this.c = str2;
        this.d = w4i1Var;
        this.e = j;
        this.f = j1j0Var;
        this.g = list;
        this.h = t1j0Var;
        this.i = z;
        this.j = list2;
    }

    @Override // p.w1j0
    public final List a() {
        return this.g;
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
        if (!(obj instanceof o1j0)) {
            return false;
        }
        o1j0 o1j0Var = (o1j0) obj;
        return this.a.equals(o1j0Var.a) && u890.j(this.b, o1j0Var.b) && u890.j(this.c, o1j0Var.c) && u890.j(this.d, o1j0Var.d) && this.e == o1j0Var.e && this.f.equals(o1j0Var.f) && u890.j(this.g, o1j0Var.g) && this.h.equals(o1j0Var.h) && this.i == o1j0Var.i && u890.j(this.j, o1j0Var.j);
    }

    public final String getId() {
        return this.b;
    }

    @Override // p.w1j0
    public final j1j0 getModerationStatus() {
        return this.f;
    }

    @Override // p.w1j0
    public final w4i1 getSender() {
        return this.d;
    }

    @Override // p.w1j0
    public final t1j0 getState() {
        return this.h;
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g((this.h.hashCode() + f4i1.b((this.f.hashCode() + cy30.f(ydh.d(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), this.e, 31)) * 31, 31, this.g)) * 31, 31, this.i);
    }
}
