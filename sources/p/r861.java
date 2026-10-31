package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r861 {
    public final String a;
    public final int b;

    public r861(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r861)) {
            return false;
        }
        r861 r861Var = (r861) obj;
        return u890.j(this.a, r861Var.a) && this.b == r861Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
