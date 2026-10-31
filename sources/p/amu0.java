package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class amu0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final bsu0 d;

    public amu0(String str, d8r0 d8r0Var, int i, bsu0 bsu0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = bsu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amu0)) {
            return false;
        }
        amu0 amu0Var = (amu0) obj;
        return this.a.equals(amu0Var.a) && this.b.equals(amu0Var.b) && this.c == amu0Var.c && this.d.equals(amu0Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
