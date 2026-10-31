package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s7z {
    public final r4z a;
    public final p1p1 b;
    public final tb2 c;

    public s7z(r4z r4zVar, p1p1 p1p1Var, tb2 tb2Var) {
        this.a = r4zVar;
        this.b = p1p1Var;
        this.c = tb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7z)) {
            return false;
        }
        s7z s7zVar = (s7z) obj;
        return this.a.equals(s7zVar.a) && this.b.equals(s7zVar.b) && u890.j(this.c, s7zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
