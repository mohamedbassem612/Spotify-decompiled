package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u0h {
    public final tv80 a;
    public final boolean b;

    public u0h(tv80 tv80Var, boolean z) {
        this.a = tv80Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0h)) {
            return false;
        }
        u0h u0hVar = (u0h) obj;
        return u890.j(this.a, u0hVar.a) && this.b == u0hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
