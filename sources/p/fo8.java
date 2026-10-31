package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fo8 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final dp8 d;

    public fo8(String str, d8r0 d8r0Var, int i, dp8 dp8Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = dp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo8)) {
            return false;
        }
        fo8 fo8Var = (fo8) obj;
        return this.a.equals(fo8Var.a) && this.b.equals(fo8Var.b) && this.c == fo8Var.c && this.d.equals(fo8Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
