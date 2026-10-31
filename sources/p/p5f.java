package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p5f implements s5f {
    public final r6f a;
    public final tv80 b;

    public p5f(r6f r6fVar, tv80 tv80Var) {
        this.a = r6fVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5f)) {
            return false;
        }
        p5f p5fVar = (p5f) obj;
        return this.a.equals(p5fVar.a) && u890.j(this.b, p5fVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
