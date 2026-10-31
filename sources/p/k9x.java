package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k9x {
    public final boolean a;

    public k9x(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9x) && this.a == ((k9x) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
