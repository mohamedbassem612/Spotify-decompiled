package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e88 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final x78 c;

    public e88(String str, d8r0 d8r0Var, x78 x78Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = x78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e88)) {
            return false;
        }
        e88 e88Var = (e88) obj;
        return this.a.equals(e88Var.a) && this.b.equals(e88Var.b) && this.c.equals(e88Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
