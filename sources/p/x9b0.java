package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x9b0 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final lfc f;
    public final aec g;

    public x9b0(String str, String str2, String str3, String str4, String str5, aec aecVar, lfc lfcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lfcVar;
        this.g = aecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9b0)) {
            return false;
        }
        x9b0 x9b0Var = (x9b0) obj;
        return this.a.equals(x9b0Var.a) && this.b.equals(x9b0Var.b) && this.c.equals(x9b0Var.c) && this.d.equals(x9b0Var.d) && this.e.equals(x9b0Var.e) && this.f == x9b0Var.f && this.g == x9b0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }
}
