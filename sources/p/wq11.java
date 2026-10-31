package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wq11 implements ar11 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public wq11(int i, int i2, int i3, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq11)) {
            return false;
        }
        wq11 wq11Var = (wq11) obj;
        return u890.j(this.a, wq11Var.a) && u890.j(this.b, wq11Var.b) && this.c == wq11Var.c && this.d == wq11Var.d && this.e == wq11Var.e && this.f == wq11Var.f;
    }

    public final String getId() {
        return l1d.m("header-", this.a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, kaa0.f(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }
}
