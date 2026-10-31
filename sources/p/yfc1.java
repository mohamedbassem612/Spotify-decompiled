package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yfc1 {
    public final int a;
    public final zfc1 b;
    public final int c;

    public yfc1(int i, zfc1 zfc1Var, int i2) {
        this.a = i;
        this.b = zfc1Var;
        this.c = i2;
    }

    public static yfc1 a(yfc1 yfc1Var, int i, zfc1 zfc1Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = yfc1Var.a;
        }
        if ((i3 & 2) != 0) {
            zfc1Var = yfc1Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = yfc1Var.c;
        }
        return new yfc1(i, zfc1Var, i2);
    }

    public final boolean b() {
        return this.c == 1 && this.a == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfc1)) {
            return false;
        }
        yfc1 yfc1Var = (yfc1) obj;
        return this.a == yfc1Var.a && this.b == yfc1Var.b && this.c == yfc1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
