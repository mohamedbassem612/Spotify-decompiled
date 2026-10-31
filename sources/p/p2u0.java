package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p2u0 extends u2u0 {
    public final String a;
    public final String b;

    public p2u0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2u0)) {
            return false;
        }
        p2u0 p2u0Var = (p2u0) obj;
        return u890.j(this.a, p2u0Var.a) && this.b.equals(p2u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
