package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vd81 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public vd81(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd81)) {
            return false;
        }
        vd81 vd81Var = (vd81) obj;
        return u890.j(this.a, vd81Var.a) && u890.j(this.b, vd81Var.b) && this.c == vd81Var.c && this.d == vd81Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
