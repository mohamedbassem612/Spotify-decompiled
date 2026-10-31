package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zt3 {
    public final boolean a;

    public zt3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt3) && this.a == ((zt3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
