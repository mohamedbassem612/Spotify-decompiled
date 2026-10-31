package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ryl1 {
    public final int a;
    public final String b;
    public final String c;

    public ryl1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryl1)) {
            return false;
        }
        ryl1 ryl1Var = (ryl1) obj;
        return this.a == ryl1Var.a && this.b.equals(ryl1Var.b) && this.c.equals(ryl1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b);
    }
}
