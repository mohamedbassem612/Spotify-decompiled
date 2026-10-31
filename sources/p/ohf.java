package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ohf {
    public final jto1 a;
    public final float b;
    public final guo1 c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ohf(jto1 jto1Var, float f, guo1 guo1Var, int i, boolean z, boolean z2) {
        this.a = jto1Var;
        this.b = f;
        this.c = guo1Var;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohf)) {
            return false;
        }
        ohf ohfVar = (ohf) obj;
        return u890.j(this.a, ohfVar.a) && Float.compare(this.b, ohfVar.b) == 0 && u890.j(this.c, ohfVar.c) && this.d == ohfVar.d && this.e == ohfVar.e && this.f == ohfVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + x0d.f(this.a.hashCode() * 31, 31, this.b)) * 31;
        int i = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.e);
    }
}
