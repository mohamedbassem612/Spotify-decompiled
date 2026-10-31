package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mcx0 extends rcx0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public mcx0(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcx0)) {
            return false;
        }
        mcx0 mcx0Var = (mcx0) obj;
        return this.a.equals(mcx0Var.a) && this.b == mcx0Var.b && this.c.equals(mcx0Var.c) && this.d.equals(mcx0Var.d) && u890.j(this.e, mcx0Var.e) && this.f == mcx0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
