package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ysk1 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;

    public ysk1(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysk1)) {
            return false;
        }
        ysk1 ysk1Var = (ysk1) obj;
        return this.a == ysk1Var.a && this.b == ysk1Var.b && this.c.equals(ysk1Var.c) && this.d == ysk1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(kaa0.f(this.b, l1d.C(this.a) * 31, 31), 31, this.c);
    }
}
