package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fdu implements idu {
    public final boolean a;

    public fdu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdu) && this.a == ((fdu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
