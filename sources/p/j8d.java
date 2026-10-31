package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j8d implements o8d {
    public final tom a;

    public j8d(tom tomVar) {
        this.a = tomVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8d) && u890.j(this.a, ((j8d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
