package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fxw extends gxw {
    public final boolean a;

    public fxw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxw) && this.a == ((fxw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
