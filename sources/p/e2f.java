package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e2f implements q3f {
    public final boolean a;

    public e2f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2f) && this.a == ((e2f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
