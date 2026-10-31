package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fwc extends hwc {
    public final boolean a;

    public fwc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwc) && this.a == ((fwc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
