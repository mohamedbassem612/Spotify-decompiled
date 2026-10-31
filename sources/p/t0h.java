package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t0h {
    public final ou80 a;

    public t0h(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0h) && u890.j(this.a, ((t0h) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
