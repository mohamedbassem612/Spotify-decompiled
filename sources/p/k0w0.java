package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k0w0 extends cxm {
    public final String d;
    public final String e;
    public final tv80 f;

    public k0w0(String str, String str2, tv80 tv80Var) {
        this.d = str;
        this.e = str2;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0w0)) {
            return false;
        }
        k0w0 k0w0Var = (k0w0) obj;
        return u890.j(this.d, k0w0Var.d) && u890.j(this.e, k0w0Var.e) && u890.j(this.f, k0w0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}
