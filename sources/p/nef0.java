package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nef0 implements ref0 {
    public final boolean a;

    public nef0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nef0) && this.a == ((nef0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
