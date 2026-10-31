package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo6 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final jx6 d;

    public uo6(String str, d8r0 d8r0Var, int i, jx6 jx6Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = jx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo6)) {
            return false;
        }
        uo6 uo6Var = (uo6) obj;
        return this.a.equals(uo6Var.a) && this.b.equals(uo6Var.b) && this.c == uo6Var.c && this.d.equals(uo6Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
