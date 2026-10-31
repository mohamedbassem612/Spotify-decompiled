package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vh20 {
    public final String a;
    public final cer0 b;

    public vh20(String str, cer0 cer0Var) {
        this.a = str;
        this.b = cer0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh20)) {
            return false;
        }
        vh20 vh20Var = (vh20) obj;
        return u890.j(this.a, vh20Var.a) && this.b.equals(vh20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
