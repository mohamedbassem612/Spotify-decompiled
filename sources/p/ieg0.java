package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ieg0 {
    public final boolean a;

    public ieg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ieg0) && this.a == ((ieg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
