package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vfz implements zo50 {
    public final Throwable a;

    public vfz(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfz) && u890.j(this.a, ((vfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
