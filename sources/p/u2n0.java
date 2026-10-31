package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u2n0 {
    public final String a;
    public final String b;

    public u2n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2n0)) {
            return false;
        }
        u2n0 u2n0Var = (u2n0) obj;
        return u890.j(this.a, u2n0Var.a) && u890.j(this.b, u2n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
