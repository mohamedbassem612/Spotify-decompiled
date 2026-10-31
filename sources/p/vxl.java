package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vxl {
    public final int a;

    public vxl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxl) && this.a == ((vxl) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
