package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k360 extends n360 {
    public final String a = "";
    public final boolean b;
    public final String c;
    public final l360 d;

    public k360(boolean z, String str, l360 l360Var) {
        this.b = z;
        this.c = str;
        this.d = l360Var;
    }

    public final String a() {
        return this.c;
    }

    public final l360 b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k360)) {
            return false;
        }
        k360 k360Var = (k360) obj;
        return this.a.equals(k360Var.a) && this.b == k360Var.b && u890.j(this.c, k360Var.c) && this.d == k360Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
