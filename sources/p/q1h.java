package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q1h implements v1h {
    public final e1h a;
    public final tv80 b;

    public q1h(e1h e1hVar, tv80 tv80Var) {
        this.a = e1hVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1h)) {
            return false;
        }
        q1h q1hVar = (q1h) obj;
        return this.a.equals(q1hVar.a) && u890.j(this.b, q1hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
