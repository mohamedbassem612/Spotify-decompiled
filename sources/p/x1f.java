package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x1f implements q3f {
    public final boolean a;

    public x1f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1f) && this.a == ((x1f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
