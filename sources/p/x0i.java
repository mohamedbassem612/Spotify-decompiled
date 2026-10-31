package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x0i {
    public final w0i a;

    public x0i(w0i w0iVar) {
        this.a = w0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0i) && this.a.equals(((x0i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
