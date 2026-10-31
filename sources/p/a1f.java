package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a1f implements q3f {
    public final boolean a;

    public a1f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1f) && this.a == ((a1f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
