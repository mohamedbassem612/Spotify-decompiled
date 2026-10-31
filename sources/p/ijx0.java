package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ijx0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    public ijx0(int i, int i2, int i3, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijx0)) {
            return false;
        }
        ijx0 ijx0Var = (ijx0) obj;
        return this.a == ijx0Var.a && this.b.equals(ijx0Var.b) && this.c.equals(ijx0Var.c) && this.d == ijx0Var.d && this.e == ijx0Var.e && this.f == ijx0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kaa0.f(this.e, kaa0.f(this.d, cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31);
    }
}
