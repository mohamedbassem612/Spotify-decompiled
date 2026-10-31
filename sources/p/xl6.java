package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xl6 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final ol6 c;

    public xl6(String str, d8r0 d8r0Var, ol6 ol6Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = ol6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl6)) {
            return false;
        }
        xl6 xl6Var = (xl6) obj;
        return this.a.equals(xl6Var.a) && this.b.equals(xl6Var.b) && this.c.equals(xl6Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
