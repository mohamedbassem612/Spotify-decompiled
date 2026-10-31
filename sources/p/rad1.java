package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class rad1 {
    public final int a;
    public final int b;
    public final String c;

    public rad1(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rad1)) {
            return false;
        }
        rad1 rad1Var = (rad1) obj;
        return this.a == rad1Var.a && this.b == rad1Var.b && u890.j(this.c, rad1Var.c);
    }

    public final int hashCode() {
        return (((l1d.C(this.a) * 31) + l1d.C(this.b)) * 31) + this.c.hashCode();
    }
}
