package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n1h implements v1h {
    public final ou80 a;

    public n1h(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1h) && u890.j(this.a, ((n1h) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
