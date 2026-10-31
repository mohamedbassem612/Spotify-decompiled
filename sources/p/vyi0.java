package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vyi0 implements yyi0 {
    public final boolean a;

    public vyi0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyi0) && this.a == ((vyi0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
