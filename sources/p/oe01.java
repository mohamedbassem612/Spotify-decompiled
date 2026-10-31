package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oe01 {
    public final boolean a;

    public oe01(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe01) && this.a == ((oe01) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
