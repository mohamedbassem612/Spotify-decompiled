package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vb80 {
    public final int a;

    public vb80(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb80) && this.a == ((vb80) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
