package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ncx0 extends rcx0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public ncx0(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncx0)) {
            return false;
        }
        ncx0 ncx0Var = (ncx0) obj;
        return this.a.equals(ncx0Var.a) && this.b == ncx0Var.b && this.c.equals(ncx0Var.c) && this.d.equals(ncx0Var.d) && u890.j(this.e, ncx0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
