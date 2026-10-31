package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nwj0 {
    public final Boolean a;
    public final boolean b;

    public nwj0(Boolean bool, boolean z) {
        this.a = bool;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwj0)) {
            return false;
        }
        nwj0 nwj0Var = (nwj0) obj;
        return u890.j(this.a, nwj0Var.a) && this.b == nwj0Var.b;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return Boolean.hashCode(this.b) + xcg1.g((bool == null ? 0 : bool.hashCode()) * 31, 31, false);
    }
}
