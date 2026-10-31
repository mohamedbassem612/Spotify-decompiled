package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class olk extends vlk {
    public final boolean a;

    public olk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olk) && this.a == ((olk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
