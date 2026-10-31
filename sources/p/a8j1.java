package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a8j1 implements e8j1 {
    public final boolean a;

    public a8j1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8j1) && this.a == ((a8j1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
