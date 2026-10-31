package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c9h0 {
    public final Throwable a;

    public c9h0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9h0) && this.a.equals(((c9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
