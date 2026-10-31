package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n89 {
    public final String a;
    public final String b;
    public final f0u c;
    public final int d;

    public n89(String str, String str2, f0u f0uVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = f0uVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n89)) {
            return false;
        }
        n89 n89Var = (n89) obj;
        return u890.j(this.a, n89Var.a) && u890.j(this.b, n89Var.b) && this.c == n89Var.c && this.d == n89Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
