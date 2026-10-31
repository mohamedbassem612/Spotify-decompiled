package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k1b {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final fbp1 d;
    public final c380 e;

    public k1b(boolean z, boolean z2, boolean z3, fbp1 fbp1Var, c380 c380Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = fbp1Var;
        this.e = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1b)) {
            return false;
        }
        k1b k1bVar = (k1b) obj;
        return this.a == k1bVar.a && this.b == k1bVar.b && this.c == k1bVar.c && u890.j(this.d, k1bVar.d) && u890.j(this.e, k1bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }
}
