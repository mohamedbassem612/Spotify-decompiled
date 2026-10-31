package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f9o0 {
    public final String a;
    public final int b;

    public f9o0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9o0)) {
            return false;
        }
        f9o0 f9o0Var = (f9o0) obj;
        return u890.j(this.a, f9o0Var.a) && this.b == f9o0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
