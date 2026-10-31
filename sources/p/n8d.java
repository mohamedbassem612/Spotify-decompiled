package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n8d implements o8d {
    public final tom a;

    public n8d(tom tomVar) {
        this.a = tomVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8d) && u890.j(this.a, ((n8d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
