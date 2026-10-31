package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a9k1 implements t9k1 {
    public final String a;
    public final tv80 b;

    public a9k1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9k1)) {
            return false;
        }
        a9k1 a9k1Var = (a9k1) obj;
        return this.a.equals(a9k1Var.a) && u890.j(this.b, a9k1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
