package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a5g0 extends t4n1 {
    public final String b;
    public final String c;

    public a5g0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5g0)) {
            return false;
        }
        a5g0 a5g0Var = (a5g0) obj;
        return u890.j(this.b, a5g0Var.b) && this.c.equals(a5g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
