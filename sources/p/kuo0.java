package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kuo0 extends puo0 {
    public final boolean a;

    public kuo0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuo0) && this.a == ((kuo0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
