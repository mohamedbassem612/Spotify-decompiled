package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fq30 {
    public final String a;
    public final eq30 b;

    public fq30(String str, eq30 eq30Var) {
        this.a = str;
        this.b = eq30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq30)) {
            return false;
        }
        fq30 fq30Var = (fq30) obj;
        return this.a.equals(fq30Var.a) && u890.j(this.b, fq30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
