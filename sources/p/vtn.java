package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vtn implements aun {
    public final int a;

    public vtn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtn) && this.a == ((vtn) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
