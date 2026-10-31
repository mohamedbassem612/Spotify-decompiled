package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n090 implements o090 {
    public final ou80 a;

    public n090(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n090) && u890.j(this.a, ((n090) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
