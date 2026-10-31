package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q1x {
    public final anf1 a;
    public boolean b = false;
    public final ju0 c;

    public q1x(anf1 anf1Var, ju0 ju0Var) {
        this.a = anf1Var;
        this.c = ju0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1x)) {
            return false;
        }
        q1x q1xVar = (q1x) obj;
        return this.a.equals(q1xVar.a) && this.b == q1xVar.b && this.c == q1xVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
