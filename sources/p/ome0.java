package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ome0 {
    public final String a;
    public final boolean b;

    public ome0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ome0)) {
            return false;
        }
        ome0 ome0Var = (ome0) obj;
        return u890.j(this.a, ome0Var.a) && this.b == ome0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
