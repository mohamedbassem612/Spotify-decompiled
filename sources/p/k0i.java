package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k0i {
    public final boolean a;

    public k0i(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0i) && this.a == ((k0i) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
