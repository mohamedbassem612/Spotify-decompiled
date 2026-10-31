package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s4o {
    public final af5 a;
    public final String b;

    public s4o(af5 af5Var, String str) {
        this.a = af5Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4o)) {
            return false;
        }
        s4o s4oVar = (s4o) obj;
        return this.a.equals(s4oVar.a) && u890.j(this.b, s4oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
