package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bzl1 {
    public final String a;
    public final cyp0 b;

    public bzl1(String str, cyp0 cyp0Var) {
        this.a = str;
        this.b = cyp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzl1)) {
            return false;
        }
        bzl1 bzl1Var = (bzl1) obj;
        return u890.j(this.a, bzl1Var.a) && this.b.equals(bzl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
