package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rnk1 {
    public final boolean a;

    public rnk1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnk1) && this.a == ((rnk1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
