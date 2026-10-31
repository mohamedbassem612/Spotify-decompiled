package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ret0 {
    public final String a;
    public final int b;

    public ret0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ret0)) {
            return false;
        }
        ret0 ret0Var = (ret0) obj;
        return u890.j(this.a, ret0Var.a) && this.b == ret0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 961);
    }
}
