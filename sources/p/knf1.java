package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class knf1 {
    public final aof1 a;
    public final boolean b;
    public final boolean c;
    public final Float d;
    public final Float e;
    public final Float f;

    public knf1(aof1 aof1Var, boolean z, boolean z2, Float f, Float f2) {
        this.a = aof1Var;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = f2;
        this.f = f != null ? Float.valueOf(Math.abs(f.floatValue())) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knf1)) {
            return false;
        }
        knf1 knf1Var = (knf1) obj;
        return this.a == knf1Var.a && this.b == knf1Var.b && this.c == knf1Var.c && u890.j(this.d, knf1Var.d) && u890.j(this.e, knf1Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Float f = this.d;
        int iHashCode = (iG + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
