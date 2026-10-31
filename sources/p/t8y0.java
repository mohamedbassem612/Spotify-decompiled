package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t8y0 {
    public final hwq a;
    public final boolean b;

    public t8y0(hwq hwqVar, boolean z) {
        this.a = hwqVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8y0)) {
            return false;
        }
        t8y0 t8y0Var = (t8y0) obj;
        return this.a.equals(t8y0Var.a) && this.b == t8y0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
