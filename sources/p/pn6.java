package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pn6 extends sn6 {
    public final String a;
    public final tv80 b;

    public pn6(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn6)) {
            return false;
        }
        pn6 pn6Var = (pn6) obj;
        return u890.j(this.a, pn6Var.a) && u890.j(this.b, pn6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
