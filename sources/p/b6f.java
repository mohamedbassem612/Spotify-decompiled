package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b6f implements r6f {
    public final boolean a;

    public b6f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6f) && this.a == ((b6f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
