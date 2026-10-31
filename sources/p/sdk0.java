package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sdk0 implements tdk0 {
    public final boolean a;

    public sdk0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdk0) && this.a == ((sdk0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
