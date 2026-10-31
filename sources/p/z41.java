package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z41 extends c51 {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public z41(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z41)) {
            return false;
        }
        z41 z41Var = (z41) obj;
        return u890.j(this.a, z41Var.a) && this.b == z41Var.b && u890.j(this.c, z41Var.c) && this.d == z41Var.d;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
