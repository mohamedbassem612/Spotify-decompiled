package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c99 {
    public final boolean a;

    public c99(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c99) && this.a == ((c99) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
