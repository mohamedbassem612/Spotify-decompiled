package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f8j1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ji0 e;
    public final n1x f;
    public final e8j1 g;
    public final long h;

    public /* synthetic */ f8j1(boolean z, ji0 ji0Var, n1x n1xVar, e8j1 e8j1Var, long j, int i) {
        this(z, false, false, false, (i & 16) != 0 ? null : ji0Var, (i & 32) != 0 ? null : n1xVar, (i & 64) != 0 ? b8j1.a : e8j1Var, j);
    }

    public static f8j1 a(f8j1 f8j1Var, boolean z, boolean z2, boolean z3, boolean z4, e8j1 e8j1Var, long j, int i) {
        if ((i & 1) != 0) {
            z = f8j1Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = f8j1Var.b;
        }
        return new f8j1(z5, z2, (i & 4) != 0 ? f8j1Var.c : z3, (i & 8) != 0 ? f8j1Var.d : z4, f8j1Var.e, f8j1Var.f, (i & 64) != 0 ? f8j1Var.g : e8j1Var, (i & 128) != 0 ? f8j1Var.h : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8j1)) {
            return false;
        }
        f8j1 f8j1Var = (f8j1) obj;
        return this.a == f8j1Var.a && this.b == f8j1Var.b && this.c == f8j1Var.c && this.d == f8j1Var.d && u890.j(this.e, f8j1Var.e) && u890.j(this.f, f8j1Var.f) && u890.j(this.g, f8j1Var.g) && this.h == f8j1Var.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        ji0 ji0Var = this.e;
        int iHashCode = (iG + (ji0Var == null ? 0 : ji0Var.hashCode())) * 31;
        n1x n1xVar = this.f;
        return Long.hashCode(this.h) + ((this.g.hashCode() + ((iHashCode + (n1xVar != null ? n1xVar.hashCode() : 0)) * 31)) * 31);
    }

    public f8j1(boolean z, boolean z2, boolean z3, boolean z4, ji0 ji0Var, n1x n1xVar, e8j1 e8j1Var, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = ji0Var;
        this.f = n1xVar;
        this.g = e8j1Var;
        this.h = j;
    }
}
