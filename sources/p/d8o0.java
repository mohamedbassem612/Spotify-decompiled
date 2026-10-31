package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d8o0 {
    public final String a;
    public final String b;
    public final w7o0 c;
    public final kc10 d;

    public d8o0(String str, String str2, w7o0 w7o0Var, kc10 kc10Var) {
        this.a = str;
        this.b = str2;
        this.c = w7o0Var;
        this.d = kc10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8o0)) {
            return false;
        }
        d8o0 d8o0Var = (d8o0) obj;
        return this.a.equals(d8o0Var.a) && u890.j(this.b, d8o0Var.b) && this.c.equals(d8o0Var.c) && u890.j(this.d, d8o0Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 961, this.c.a);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.a + ", method=" + this.b + ", headers=" + this.c + ", body=null, extras=" + this.d + ')';
    }
}
