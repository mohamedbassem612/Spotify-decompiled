package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wyg {
    public final boolean a;

    public wyg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyg) && this.a == ((wyg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
