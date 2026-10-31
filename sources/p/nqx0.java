package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nqx0 extends frx0 {
    public final String a;
    public final String b;

    public nqx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqx0)) {
            return false;
        }
        nqx0 nqx0Var = (nqx0) obj;
        return u890.j(this.a, nqx0Var.a) && u890.j(this.b, nqx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
