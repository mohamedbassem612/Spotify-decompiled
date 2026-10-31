package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yp70 {
    public final String a;
    public final int b;
    public final int c;

    public yp70(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp70)) {
            return false;
        }
        yp70 yp70Var = (yp70) obj;
        return this.a.equals(yp70Var.a) && this.b == yp70Var.b && this.c == yp70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
