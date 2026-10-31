package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c311 {
    public final d8r0 a;
    public final c380 b;

    public c311(d8r0 d8r0Var, c380 c380Var) {
        this.a = d8r0Var;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c311)) {
            return false;
        }
        c311 c311Var = (c311) obj;
        return this.a.equals(c311Var.a) && u890.j(this.b, c311Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
