package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nys0 {
    public final boolean a;

    public nys0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nys0) && this.a == ((nys0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(this.a) * 31);
    }
}
