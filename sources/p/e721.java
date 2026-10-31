package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e721 {
    public final String a;
    public final f721 b;

    public e721(String str, f721 f721Var) {
        this.a = str;
        this.b = f721Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e721)) {
            return false;
        }
        e721 e721Var = (e721) obj;
        return u890.j(this.a, e721Var.a) && this.b == e721Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
