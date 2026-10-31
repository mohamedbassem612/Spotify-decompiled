package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vle0 extends hme0 {
    public final boolean a;

    public vle0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vle0) && this.a == ((vle0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
