package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tgo implements vgo {
    public final Exception a;

    public tgo(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgo) && this.a.equals(((tgo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
