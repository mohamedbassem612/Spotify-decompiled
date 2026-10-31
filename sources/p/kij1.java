package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kij1 {
    public final boolean a;

    public kij1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kij1) && this.a == ((kij1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
