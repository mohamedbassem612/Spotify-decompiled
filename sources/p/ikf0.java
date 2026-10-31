package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ikf0 extends jkf0 {
    public final int b;
    public final lqs0 c;

    public ikf0(int i, lqs0 lqs0Var) {
        super(i);
        this.b = i;
        this.c = lqs0Var;
    }

    @Override // p.jkf0
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikf0)) {
            return false;
        }
        ikf0 ikf0Var = (ikf0) obj;
        return this.b == ikf0Var.b && u890.j(this.c, ikf0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.b) * 31;
        lqs0 lqs0Var = this.c;
        lqs0Var.getClass();
        return pto1.z(lqs0Var) + iHashCode;
    }
}
