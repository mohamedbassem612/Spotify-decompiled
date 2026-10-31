package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fkz {
    public final boolean a;

    public fkz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkz) && this.a == ((fkz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
