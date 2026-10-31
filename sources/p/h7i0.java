package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h7i0 {
    public final String a;
    public final z9b0 b;

    public h7i0(String str, z9b0 z9b0Var) {
        this.a = str;
        this.b = z9b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h7i0) {
            h7i0 h7i0Var = (h7i0) obj;
            return u890.j(this.a, h7i0Var.a) && this.b == h7i0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
