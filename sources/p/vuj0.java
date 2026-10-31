package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vuj0 implements ez00 {
    public final boolean a;

    public vuj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuj0) && this.a == ((vuj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
