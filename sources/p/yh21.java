package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yh21 {
    public final String a;
    public final n5o0 b;

    public yh21(String str, n5o0 n5o0Var) {
        this.a = str;
        this.b = n5o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh21)) {
            return false;
        }
        yh21 yh21Var = (yh21) obj;
        return u890.j(this.a, yh21Var.a) && this.b == yh21Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n5o0 n5o0Var = this.b;
        return iHashCode + (n5o0Var != null ? n5o0Var.hashCode() : 0);
    }
}
