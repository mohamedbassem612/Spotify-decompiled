package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q0z extends m0v0 {
    public final l661 m;
    public final idd1 n;

    public q0z(String str, int i) {
        super(str, null, i);
        this.m = l661.h;
        this.n = new idd1(new ddc(i, str, this));
    }

    @Override // p.m0v0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h661)) {
            return false;
        }
        h661 h661Var = (h661) obj;
        return h661Var.getKind() == l661.h && this.a.equals(h661Var.h()) && u890.j(j0o1.p(this), j0o1.p(h661Var));
    }

    @Override // p.m0v0, p.h661
    public final h661 g(int i) {
        return ((h661[]) this.n.getValue())[i];
    }

    @Override // p.m0v0, p.h661
    public final yoi1 getKind() {
        return this.m;
    }

    @Override // p.m0v0
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        d7 it = mmo1.x(this).iterator();
        int iHashCode2 = 1;
        while (true) {
            d7 d7Var = it;
            if (!d7Var.hasNext()) {
                return (iHashCode * 31) + iHashCode2;
            }
            int i = iHashCode2 * 31;
            String str = (String) d7Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
    }

    @Override // p.m0v0
    public final String toString() {
        return o7h.y0(mmo1.x(this), ", ", this.a.concat("("), ")", null, 56);
    }
}
