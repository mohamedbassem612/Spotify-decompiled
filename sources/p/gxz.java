package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gxz implements t600 {
    public final boolean a;

    public gxz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxz) && this.a == ((gxz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
