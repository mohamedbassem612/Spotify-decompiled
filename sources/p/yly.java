package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yly {
    public final s07 a;
    public final zly b;
    public final boolean c;
    public final xly d;

    public yly(s07 s07Var, zly zlyVar, boolean z, xly xlyVar) {
        this.a = s07Var;
        this.b = zlyVar;
        this.c = z;
        this.d = xlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yly)) {
            return false;
        }
        yly ylyVar = (yly) obj;
        return this.a.equals(ylyVar.a) && u890.j(this.b, ylyVar.b) && this.c == ylyVar.c && this.d.equals(ylyVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zly zlyVar = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (zlyVar == null ? 0 : zlyVar.hashCode())) * 31, 31, this.c);
    }
}
