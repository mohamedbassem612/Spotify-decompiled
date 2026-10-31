package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nli0 {
    public final boolean a;

    public nli0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nli0) && this.a == ((nli0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
