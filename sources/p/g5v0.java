package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g5v0 {
    public final String a;
    public final String b;

    public g5v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5v0)) {
            return false;
        }
        g5v0 g5v0Var = (g5v0) obj;
        return u890.j(this.a, g5v0Var.a) && u890.j(this.b, g5v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
