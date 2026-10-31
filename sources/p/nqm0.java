package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nqm0 {
    public final String a;
    public final u380 b;
    public final c380 c;
    public final int d;

    public nqm0(String str, u380 u380Var, c380 c380Var) {
        this.a = str;
        this.b = u380Var;
        this.c = c380Var;
        this.d = u380Var.size() - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqm0)) {
            return false;
        }
        nqm0 nqm0Var = (nqm0) obj;
        return this.a.equals(nqm0Var.a) && u890.j(this.b, nqm0Var.b) && u890.j(this.c, nqm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
