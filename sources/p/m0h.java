package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m0h {
    public final e1h a;
    public final tv80 b;
    public final boolean c;

    public m0h(e1h e1hVar, tv80 tv80Var, boolean z) {
        this.a = e1hVar;
        this.b = tv80Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0h)) {
            return false;
        }
        m0h m0hVar = (m0h) obj;
        return this.a.equals(m0hVar.a) && u890.j(this.b, m0hVar.b) && this.c == m0hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
