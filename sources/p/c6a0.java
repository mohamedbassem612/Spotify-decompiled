package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6a0 {
    public final boolean a;

    public c6a0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6a0) && this.a == ((c6a0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
