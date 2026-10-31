package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vxr0 implements wxr0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public vxr0(int i, String str, String str2, boolean z, boolean z2) {
        z2 = (i & 4) != 0 ? true : z2;
        boolean z3 = (i & 8) == 0;
        str2 = (i & 16) != 0 ? null : str2;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
    }

    @Override // p.wxr0
    public final boolean a() {
        return this.c;
    }

    @Override // p.wxr0
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxr0)) {
            return false;
        }
        vxr0 vxr0Var = (vxr0) obj;
        return u890.j(this.a, vxr0Var.a) && this.b == vxr0Var.b && this.c == vxr0Var.c && this.d == vxr0Var.d && u890.j(this.e, vxr0Var.e);
    }

    @Override // p.wxr0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
