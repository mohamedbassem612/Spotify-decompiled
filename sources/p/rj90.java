package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rj90 {
    public final Boolean a;
    public final boolean b;

    public rj90(int i, boolean z) {
        Boolean bool = (i & 1) != 0 ? null : Boolean.FALSE;
        z = (i & 4) != 0 ? false : z;
        this.a = bool;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj90)) {
            return false;
        }
        rj90 rj90Var = (rj90) obj;
        return u890.j(this.a, rj90Var.a) && this.b == rj90Var.b;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return Boolean.hashCode(this.b) + ((bool == null ? 0 : bool.hashCode()) * 961);
    }
}
