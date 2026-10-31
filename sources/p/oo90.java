package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oo90 {
    public final boolean a;

    public oo90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo90) && this.a == ((oo90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
