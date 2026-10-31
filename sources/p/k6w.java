package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k6w implements o6w {
    public final RuntimeException a;

    public k6w(RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6w) && this.a.equals(((k6w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
