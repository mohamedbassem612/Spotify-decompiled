package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q0a {
    public final ti30 a;
    public final xg30 b;

    public q0a(ti30 ti30Var, xg30 xg30Var) {
        this.a = ti30Var;
        this.b = xg30Var;
    }

    public final xg30 a() {
        return this.b;
    }

    public final ti30 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0a) {
            q0a q0aVar = (q0a) obj;
            if (this.a == q0aVar.a && u890.j(this.b, q0aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
