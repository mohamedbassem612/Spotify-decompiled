package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kxv implements oxv {
    public final boolean a;

    public kxv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxv) && this.a == ((kxv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
