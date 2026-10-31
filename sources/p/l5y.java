package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l5y {
    public final boolean a;
    public final k5y b;
    public final g5y c;
    public final boolean d;
    public final boolean e;

    public l5y(boolean z, k5y k5yVar, g5y g5yVar, boolean z2, boolean z3) {
        this.a = z;
        this.b = k5yVar;
        this.c = g5yVar;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5y)) {
            return false;
        }
        l5y l5yVar = (l5y) obj;
        return this.a == l5yVar.a && this.b.equals(l5yVar.b) && u890.j(this.c, l5yVar.c) && this.d == l5yVar.d && this.e == l5yVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        g5y g5yVar = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iHashCode + (g5yVar == null ? 0 : g5yVar.a.hashCode())) * 31, 31, this.d);
    }
}
