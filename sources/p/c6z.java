package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c6z {
    public final x7i1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ c6z() {
        this(new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191), false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6z)) {
            return false;
        }
        c6z c6zVar = (c6z) obj;
        return u890.j(this.a, c6zVar.a) && this.b == c6zVar.b && this.c == c6zVar.c && this.d == c6zVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public c6z(x7i1 x7i1Var, boolean z, boolean z2, boolean z3) {
        this.a = x7i1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
