package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ze5 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ze5(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        rf80.a("Reversed range is not supported");
    }

    public static ze5 a(ze5 ze5Var, we5 we5Var, int i, int i2, int i3) {
        Object obj = we5Var;
        if ((i3 & 1) != 0) {
            obj = ze5Var.a;
        }
        if ((i3 & 2) != 0) {
            i = ze5Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = ze5Var.c;
        }
        return new ze5(i, i2, obj, ze5Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze5)) {
            return false;
        }
        ze5 ze5Var = (ze5) obj;
        return u890.j(this.a, ze5Var.a) && this.b == ze5Var.b && this.c == ze5Var.c && u890.j(this.d, ze5Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public ze5(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
