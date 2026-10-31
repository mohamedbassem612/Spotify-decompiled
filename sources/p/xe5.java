package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xe5 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ xe5(int i, int i2, int i3, Object obj, String str) {
        this(i, (i3 & 4) != 0 ? os00.INVALID_ID : i2, obj, (i3 & 8) != 0 ? "" : str);
    }

    public final ze5 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            rf80.c("Item.end should be set first");
        }
        return new ze5(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe5)) {
            return false;
        }
        xe5 xe5Var = (xe5) obj;
        return u890.j(this.a, xe5Var.a) && this.b == xe5Var.b && this.c == xe5Var.c && u890.j(this.d, xe5Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public xe5(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
