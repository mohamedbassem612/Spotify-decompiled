package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r0o0 implements z0o0 {
    public final int a;
    public final String b;
    public final List c;
    public final boolean d;
    public final y0o0 e;
    public final boolean f;
    public final iu30 g;

    public r0o0(int i, String str, List list, boolean z, y0o0 y0o0Var, boolean z2, iu30 iu30Var) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = y0o0Var;
        this.f = z2;
        this.g = iu30Var;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r0o0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        r0o0 r0o0Var = (r0o0) obj;
        return this.a == r0o0Var.a && this.b.equals(r0o0Var.b) && this.c.equals(r0o0Var.c) && this.d == r0o0Var.d && this.e.equals(r0o0Var.e) && this.f == r0o0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + xcg1.g(f4i1.b(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
