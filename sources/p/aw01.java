package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aw01 {
    public final int a;
    public final cr01 b;
    public final boolean c;
    public final String d;
    public final int e;

    public aw01(int i, cr01 cr01Var, boolean z, String str, int i2) {
        this.a = i;
        this.b = cr01Var;
        this.c = z;
        this.d = str;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw01)) {
            return false;
        }
        aw01 aw01Var = (aw01) obj;
        return this.a == aw01Var.a && u890.j(this.b, aw01Var.b) && this.c == aw01Var.c && this.d.equals(aw01Var.d) && this.e == aw01Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + cy30.d(xcg1.g((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
    }
}
