package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ww60 {
    public final int a;
    public final String b;
    public final int c;
    public final cd90 d;
    public final String e;
    public final boolean f;

    public ww60(int i, String str, int i2, cd90 cd90Var, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = cd90Var;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww60)) {
            return false;
        }
        ww60 ww60Var = (ww60) obj;
        return this.a == ww60Var.a && u890.j(this.b, ww60Var.b) && this.c == ww60Var.c && u890.j(this.d, ww60Var.d) && u890.j(this.e, ww60Var.e) && this.f == ww60Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(f4i1.b(kaa0.f(this.c, cy30.d(l1d.C(this.a) * 31, 31, this.b), 31), 31, this.d.a), 31, this.e);
    }

    public /* synthetic */ ww60(int i, String str, int i2, cd90 cd90Var) {
        this(i, str, i2, cd90Var, "https://support.spotify.com/us/article/jam/", false);
    }
}
