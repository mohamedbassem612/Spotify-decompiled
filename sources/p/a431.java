package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a431 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final x331 c;

    public a431(String str, d8r0 d8r0Var, x331 x331Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = x331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a431)) {
            return false;
        }
        a431 a431Var = (a431) obj;
        return this.a.equals(a431Var.a) && this.b.equals(a431Var.b) && this.c.equals(a431Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
