package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v2n0 {
    public final String a;
    public final int b;

    public v2n0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2n0)) {
            return false;
        }
        v2n0 v2n0Var = (v2n0) obj;
        return u890.j(this.a, v2n0Var.a) && this.b == v2n0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
