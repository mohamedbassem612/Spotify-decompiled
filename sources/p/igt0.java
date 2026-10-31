package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class igt0 extends xzo1 {
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final h131 h;
    public final boolean i;

    public igt0(String str, String str2, int i, String str3, int i2, h131 h131Var, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = i2;
        this.h = h131Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igt0)) {
            return false;
        }
        igt0 igt0Var = (igt0) obj;
        return u890.j(this.c, igt0Var.c) && this.d.equals(igt0Var.d) && this.e == igt0Var.e && u890.j(this.f, igt0Var.f) && this.g == igt0Var.g && this.h.equals(igt0Var.h) && this.i == igt0Var.i;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, cy30.d(this.c.hashCode() * 31, 31, this.d), 31);
        String str = this.f;
        return gqt0.a.hashCode() + xcg1.g((this.h.hashCode() + ab80.k(this.g, (iF + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.i);
    }
}
