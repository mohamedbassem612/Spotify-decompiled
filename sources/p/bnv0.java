package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bnv0 extends fae1 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public bnv0(String str, String str2, String str3, String str4) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnv0)) {
            return false;
        }
        bnv0 bnv0Var = (bnv0) obj;
        return u890.j(this.d, bnv0Var.d) && u890.j(this.e, bnv0Var.e) && u890.j(this.f, bnv0Var.f) && u890.j(this.g, bnv0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f);
    }

    public final String m() {
        return this.d;
    }
}
