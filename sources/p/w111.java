package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w111 extends x111 {
    public final String a;
    public final int b;

    public w111(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w111)) {
            return false;
        }
        w111 w111Var = (w111) obj;
        return u890.j(this.a, w111Var.a) && this.b == w111Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
