package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uqe1 {
    public final hux a;
    public final boolean b;

    public uqe1(hux huxVar, boolean z) {
        this.a = huxVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqe1)) {
            return false;
        }
        uqe1 uqe1Var = (uqe1) obj;
        return u890.j(this.a, uqe1Var.a) && this.b == uqe1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
