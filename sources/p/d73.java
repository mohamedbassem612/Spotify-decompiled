package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d73 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final s63 c;

    public d73(String str, d8r0 d8r0Var, s63 s63Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = s63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d73)) {
            return false;
        }
        d73 d73Var = (d73) obj;
        return this.a.equals(d73Var.a) && this.b.equals(d73Var.b) && this.c.equals(d73Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
