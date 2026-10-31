package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zag1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zag1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zag1)) {
            return false;
        }
        zag1 zag1Var = (zag1) obj;
        return u890.j(this.a, zag1Var.a) && this.b == zag1Var.b && this.c == zag1Var.c && this.d == zag1Var.d && this.e == zag1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public /* synthetic */ zag1() {
        this("", false, false, false, false);
    }
}
