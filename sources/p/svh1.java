package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class svh1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public svh1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svh1)) {
            return false;
        }
        svh1 svh1Var = (svh1) obj;
        return u890.j(this.a, svh1Var.a) && u890.j(this.b, svh1Var.b) && this.c.equals(svh1Var.c) && u890.j(this.d, svh1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
