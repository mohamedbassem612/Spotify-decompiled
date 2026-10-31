package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kt7 {
    public final u771 a;
    public final int b;
    public final mt7 c;

    public kt7(u771 u771Var, int i, mt7 mt7Var) {
        this.a = u771Var;
        this.b = i;
        this.c = mt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt7)) {
            return false;
        }
        kt7 kt7Var = (kt7) obj;
        return u890.j(this.a, kt7Var.a) && this.b == kt7Var.b && u890.j(this.c, kt7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
