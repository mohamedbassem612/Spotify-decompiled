package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vv00 {
    public final String a;
    public final int b;

    public vv00(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv00)) {
            return false;
        }
        vv00 vv00Var = (vv00) obj;
        return u890.j(this.a, vv00Var.a) && this.b == vv00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
