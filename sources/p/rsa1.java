package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rsa1 implements dta1 {
    public final nmw0 a;

    public rsa1(nmw0 nmw0Var) {
        this.a = nmw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsa1) && u890.j(this.a, ((rsa1) obj).a);
    }

    public final int hashCode() {
        nmw0 nmw0Var = this.a;
        if (nmw0Var == null) {
            return 0;
        }
        return nmw0Var.hashCode();
    }
}
