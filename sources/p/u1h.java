package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u1h implements v1h {
    public final e1h a;
    public final ou80 b;

    public u1h(e1h e1hVar, ou80 ou80Var) {
        this.a = e1hVar;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1h)) {
            return false;
        }
        u1h u1hVar = (u1h) obj;
        return this.a.equals(u1hVar.a) && u890.j(this.b, u1hVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
