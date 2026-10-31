package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s3w0 {
    public final String a;
    public final String b;
    public final String c;
    public final kjj1 d;
    public final boolean e;
    public final k4m f;

    public s3w0(String str, String str2, String str3, kjj1 kjj1Var, boolean z, k4m k4mVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kjj1Var;
        this.e = z;
        this.f = k4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3w0)) {
            return false;
        }
        s3w0 s3w0Var = (s3w0) obj;
        return u890.j(this.a, s3w0Var.a) && this.b.equals(s3w0Var.b) && u890.j(this.c, s3w0Var.c) && this.d.equals(s3w0Var.d) && this.e == s3w0Var.e && this.f == s3w0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 29791, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }
}
