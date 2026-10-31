package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xya1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public xya1(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xya1)) {
            return false;
        }
        xya1 xya1Var = (xya1) obj;
        return u890.j(this.a, xya1Var.a) && u890.j(this.b, xya1Var.b) && this.c == xya1Var.c && this.d == xya1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
