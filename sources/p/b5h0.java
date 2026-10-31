package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5h0 implements h5h0 {
    public final String a;
    public final boolean b;

    public b5h0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5h0)) {
            return false;
        }
        b5h0 b5h0Var = (b5h0) obj;
        return u890.j(this.a, b5h0Var.a) && this.b == b5h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
