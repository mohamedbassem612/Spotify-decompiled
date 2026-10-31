package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r4w0 {
    public final String a;
    public final int b;

    public r4w0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4w0)) {
            return false;
        }
        r4w0 r4w0Var = (r4w0) obj;
        return u890.j(this.a, r4w0Var.a) && this.b == r4w0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
