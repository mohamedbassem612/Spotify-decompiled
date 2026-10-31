package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j8z {
    public final i091 a;
    public final boolean b;
    public final hlw0 c;

    public j8z(i091 i091Var, boolean z, hlw0 hlw0Var) {
        this.a = i091Var;
        this.b = z;
        this.c = hlw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8z)) {
            return false;
        }
        j8z j8zVar = (j8z) obj;
        return this.a.equals(j8zVar.a) && this.b == j8zVar.b && u890.j(this.c, j8zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
