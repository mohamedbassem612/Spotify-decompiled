package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c2w0 extends h2w0 {
    public final String a;
    public final String b;
    public final tv80 c;

    public c2w0(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2w0)) {
            return false;
        }
        c2w0 c2w0Var = (c2w0) obj;
        return u890.j(this.a, c2w0Var.a) && u890.j(this.b, c2w0Var.b) && u890.j(this.c, c2w0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
