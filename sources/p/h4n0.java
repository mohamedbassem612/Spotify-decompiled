package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h4n0 {
    public final String a;
    public final String b;

    public h4n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4n0)) {
            return false;
        }
        h4n0 h4n0Var = (h4n0) obj;
        return u890.j(this.a, h4n0Var.a) && this.b.equals(h4n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
