package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q0h {
    public final ou80 a;
    public final boolean b;

    public q0h(ou80 ou80Var, boolean z) {
        this.a = ou80Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0h)) {
            return false;
        }
        q0h q0hVar = (q0h) obj;
        return u890.j(this.a, q0hVar.a) && this.b == q0hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }
}
