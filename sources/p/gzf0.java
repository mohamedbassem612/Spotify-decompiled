package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gzf0 {
    public final String a;
    public final bbr0 b;
    public final bsc0 c;
    public final m0n0 d;
    public final rzf0 e;
    public final erl1 f;
    public final qim0 g;
    public final cp20 h;

    public gzf0(String str, bbr0 bbr0Var, bsc0 bsc0Var, m0n0 m0n0Var, rzf0 rzf0Var, erl1 erl1Var, qim0 qim0Var, cp20 cp20Var) {
        this.a = str;
        this.b = bbr0Var;
        this.c = bsc0Var;
        this.d = m0n0Var;
        this.e = rzf0Var;
        this.f = erl1Var;
        this.g = qim0Var;
        this.h = cp20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gzf0) {
            gzf0 gzf0Var = (gzf0) obj;
            return this.a.equals(gzf0Var.a) && u890.j(this.b, gzf0Var.b) && this.c == gzf0Var.c && this.d == gzf0Var.d && u890.j(this.e, gzf0Var.e) && u890.j(this.f, gzf0Var.f) && u890.j(this.g, gzf0Var.g) && this.h == gzf0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
