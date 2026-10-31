package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nxe0 implements w11 {
    public final kww a;

    public nxe0(kww kwwVar) {
        this.a = kwwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxe0) && this.a.equals(((nxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
