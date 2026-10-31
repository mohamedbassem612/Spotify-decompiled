package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gc1 {
    public final String a;
    public final wxn0 b;

    public gc1(String str, wxn0 wxn0Var) {
        this.a = str;
        this.b = wxn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc1)) {
            return false;
        }
        gc1 gc1Var = (gc1) obj;
        return u890.j(this.a, gc1Var.a) && this.b == gc1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
