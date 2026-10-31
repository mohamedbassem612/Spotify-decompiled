package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w98 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof w98) {
            return this.a.equals(((w98) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("OnCappedEvent(bookUri=", this.a, ")");
    }
}
