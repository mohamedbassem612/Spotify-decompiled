package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dxe0 {
    public final sf8 a;

    public dxe0(sf8 sf8Var) {
        this.a = sf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxe0) && this.a.equals(((dxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
