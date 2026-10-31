package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yj91 extends bk91 {
    public final int a;
    public final String b;
    public final int c;

    public yj91(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj91)) {
            return false;
        }
        yj91 yj91Var = (yj91) obj;
        return this.a == yj91Var.a && u890.j(this.b, yj91Var.b) && this.c == yj91Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
