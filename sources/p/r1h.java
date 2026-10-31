package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r1h implements v1h {
    public final e1h a;
    public final tv80 b;

    public r1h(e1h e1hVar, tv80 tv80Var) {
        this.a = e1hVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1h)) {
            return false;
        }
        r1h r1hVar = (r1h) obj;
        return this.a.equals(r1hVar.a) && u890.j(this.b, r1hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
