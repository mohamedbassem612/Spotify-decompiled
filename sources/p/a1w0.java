package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a1w0 {
    public final o4n a;

    public a1w0(o4n o4nVar) {
        this.a = o4nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1w0) && this.a.equals(((a1w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
