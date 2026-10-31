package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c0a0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final f0u d;
    public final int e;
    public final String f;
    public final qo90 g;
    public final int h;

    public c0a0(boolean z, String str, String str2, f0u f0uVar, int i, String str3, qo90 qo90Var, int i2, int i3) {
        str3 = (i3 & 32) != 0 ? null : str3;
        i2 = (i3 & 128) != 0 ? 0 : i2;
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = f0uVar;
        this.e = i;
        this.f = str3;
        this.g = qo90Var;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0a0)) {
            return false;
        }
        c0a0 c0a0Var = (c0a0) obj;
        return this.a == c0a0Var.a && u890.j(this.b, c0a0Var.b) && u890.j(this.c, c0a0Var.c) && this.d == c0a0Var.d && this.e == c0a0Var.e && u890.j(this.f, c0a0Var.f) && this.g.equals(c0a0Var.g) && this.h == c0a0Var.h;
    }

    public final int hashCode() {
        int iK = ab80.k(this.e, (this.d.hashCode() + cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31);
        String str = this.f;
        int iHashCode = (this.g.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        int i = this.h;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
