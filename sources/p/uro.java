package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uro implements wro {
    public final xro a;

    public uro(xro xroVar) {
        this.a = xroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uro) && this.a.equals(((uro) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
