package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class er {
    public final int a;
    public final ev b;
    public final c380 c;
    public final boolean d;
    public final boolean e;

    public er(int i, ev evVar, c380 c380Var, boolean z, boolean z2) {
        this.a = i;
        this.b = evVar;
        this.c = c380Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        er erVar = (er) obj;
        return this.a == erVar.a && u890.j(this.b, erVar.b) && u890.j(this.c, erVar.c) && this.d == erVar.d && this.e == erVar.e;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        ev evVar = this.b;
        int iHashCode = (iC + (evVar == null ? 0 : evVar.hashCode())) * 31;
        c380 c380Var = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iHashCode + (c380Var != null ? c380Var.hashCode() : 0)) * 31, 31, this.d);
    }
}
