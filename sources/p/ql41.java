package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ql41 implements ul41 {
    public final String a;
    public final hm41 b;

    public ql41(String str, hm41 hm41Var) {
        this.a = str;
        this.b = hm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql41)) {
            return false;
        }
        ql41 ql41Var = (ql41) obj;
        return u890.j(this.a, ql41Var.a) && this.b.equals(ql41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
