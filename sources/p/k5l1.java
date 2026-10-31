package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k5l1 {
    public final boolean a;

    public k5l1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5l1) && this.a == ((k5l1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
