package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xi90 {
    public final boolean a;
    public final Boolean b;

    public xi90(Boolean bool, boolean z) {
        this.a = z;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi90)) {
            return false;
        }
        xi90 xi90Var = (xi90) obj;
        return this.a == xi90Var.a && u890.j(this.b, xi90Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public /* synthetic */ xi90() {
        this(null, true);
    }
}
