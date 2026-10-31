package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vqw0 implements brw0 {
    public final o4g a;

    public vqw0(o4g o4gVar) {
        this.a = o4gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqw0) && this.a.equals(((vqw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
