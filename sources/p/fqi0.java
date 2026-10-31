package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fqi0 extends sto1 {
    public final boolean b;

    public fqi0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqi0) && this.b == ((fqi0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
