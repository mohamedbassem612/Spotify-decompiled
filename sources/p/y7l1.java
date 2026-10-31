package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y7l1 {
    public final x7l1 a;
    public final Object b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;

    public y7l1(x7l1 x7l1Var, x360 x360Var, boolean z, String str, String str2, int i, int i2) {
        x360Var = (i2 & 2) != 0 ? null : x360Var;
        z = (i2 & 4) != 0 ? false : z;
        str = (i2 & 8) != 0 ? "" : str;
        i = (i2 & 32) != 0 ? 0 : i;
        this.a = x7l1Var;
        this.b = x360Var;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7l1)) {
            return false;
        }
        y7l1 y7l1Var = (y7l1) obj;
        return this.a.equals(y7l1Var.a) && u890.j(this.b, y7l1Var.b) && this.c == y7l1Var.c && this.d.equals(y7l1Var.d) && this.e.equals(y7l1Var.e) && this.f == y7l1Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return Integer.hashCode(this.f) + cy30.d(cy30.d(xcg1.g((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
