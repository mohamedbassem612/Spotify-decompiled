package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vab0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public vab0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vab0)) {
            return false;
        }
        vab0 vab0Var = (vab0) obj;
        return u890.j(this.a, vab0Var.a) && u890.j(this.b, vab0Var.b) && this.c == vab0Var.c && this.d == vab0Var.d && this.e == vab0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
