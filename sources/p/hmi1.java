package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hmi1 implements xmi1 {
    public final boolean a;

    public hmi1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmi1) && this.a == ((hmi1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
