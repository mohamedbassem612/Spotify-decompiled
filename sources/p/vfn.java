package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vfn implements ugn {
    public final boolean a;

    public vfn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfn) && this.a == ((vfn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
