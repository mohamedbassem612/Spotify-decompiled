package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oog extends tog {
    public final boolean a;

    public oog(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oog) && this.a == ((oog) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
