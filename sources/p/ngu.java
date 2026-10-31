package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ngu {
    public final boolean a;

    public ngu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngu) && this.a == ((ngu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
