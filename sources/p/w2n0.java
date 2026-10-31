package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w2n0 {
    public final String a;
    public final int b;

    public w2n0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2n0)) {
            return false;
        }
        w2n0 w2n0Var = (w2n0) obj;
        return u890.j(this.a, w2n0Var.a) && this.b == w2n0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
