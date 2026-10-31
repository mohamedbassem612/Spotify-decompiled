package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pvd1 extends k1p1 {
    public final c380 c;
    public final c380 d;

    public pvd1(c380 c380Var, c380 c380Var2) {
        this.c = c380Var;
        this.d = c380Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvd1)) {
            return false;
        }
        pvd1 pvd1Var = (pvd1) obj;
        return u890.j(this.c, pvd1Var.c) && u890.j(this.d, pvd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
