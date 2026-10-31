package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s0h {
    public final e1h a;
    public final ou80 b;

    public s0h(e1h e1hVar, ou80 ou80Var) {
        this.a = e1hVar;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0h)) {
            return false;
        }
        s0h s0hVar = (s0h) obj;
        return this.a.equals(s0hVar.a) && u890.j(this.b, s0hVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
