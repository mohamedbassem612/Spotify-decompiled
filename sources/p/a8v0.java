package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a8v0 extends b8v0 {
    public final String a;
    public final boolean b;

    public a8v0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8v0)) {
            return false;
        }
        a8v0 a8v0Var = (a8v0) obj;
        return u890.j(this.a, a8v0Var.a) && this.b == a8v0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
