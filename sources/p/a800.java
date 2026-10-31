package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a800 {
    public final String a;
    public final int b;
    public final tv80 c;

    public a800(int i, String str, tv80 tv80Var) {
        this.a = str;
        this.b = i;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a800)) {
            return false;
        }
        a800 a800Var = (a800) obj;
        return u890.j(this.a, a800Var.a) && this.b == a800Var.b && u890.j(this.c, a800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
