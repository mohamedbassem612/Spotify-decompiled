package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u0x0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final s0x0 c;

    public u0x0(String str, d8r0 d8r0Var, s0x0 s0x0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = s0x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0x0)) {
            return false;
        }
        u0x0 u0x0Var = (u0x0) obj;
        return this.a.equals(u0x0Var.a) && this.b.equals(u0x0Var.b) && this.c.equals(u0x0Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
