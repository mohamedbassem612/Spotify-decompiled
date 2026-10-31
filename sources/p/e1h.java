package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e1h extends f1h {
    public final fy6 b;
    public final int c;
    public final int d;

    public e1h(fy6 fy6Var, int i, int i2) {
        super(c1h.b);
        this.b = fy6Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1h)) {
            return false;
        }
        e1h e1hVar = (e1h) obj;
        return this.b.equals(e1hVar.b) && this.c == e1hVar.c && this.d == e1hVar.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kaa0.f(this.c, this.b.hashCode() * 31, 31);
    }
}
