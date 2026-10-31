package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n1a1 extends q1a1 {
    public final String a;
    public final String b;

    public n1a1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1a1)) {
            return false;
        }
        n1a1 n1a1Var = (n1a1) obj;
        return u890.j(this.a, n1a1Var.a) && u890.j(this.b, n1a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
