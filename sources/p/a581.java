package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a581 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final ba81 d;

    public a581(String str, d8r0 d8r0Var, int i, ba81 ba81Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = ba81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a581)) {
            return false;
        }
        a581 a581Var = (a581) obj;
        return this.a.equals(a581Var.a) && this.b.equals(a581Var.b) && this.c == a581Var.c && this.d.equals(a581Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
