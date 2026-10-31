package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5h0 implements z5h0 {
    public final String a;
    public final c380 b;
    public final lpu c;

    public y5h0(String str, lpu lpuVar, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
        this.c = lpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5h0)) {
            return false;
        }
        y5h0 y5h0Var = (y5h0) obj;
        return this.a.equals(y5h0Var.a) && u890.j(this.b, y5h0Var.b) && this.c.equals(y5h0Var.c);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 961, 31);
    }
}
