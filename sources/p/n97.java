package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n97 {
    public final String a;
    public final i b;
    public final tv80 c;

    public n97(String str, i iVar, tv80 tv80Var) {
        this.a = str;
        this.b = iVar;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n97)) {
            return false;
        }
        n97 n97Var = (n97) obj;
        return u890.j(this.a, n97Var.a) && this.b.equals(n97Var.b) && this.c.equals(n97Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
