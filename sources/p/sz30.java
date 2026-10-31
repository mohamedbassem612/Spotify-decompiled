package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sz30 extends dug {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final tv80 g;

    public sz30(String str, String str2, String str3, String str4, tv80 tv80Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz30)) {
            return false;
        }
        sz30 sz30Var = (sz30) obj;
        return u890.j(this.c, sz30Var.c) && this.d.equals(sz30Var.d) && this.e.equals(sz30Var.e) && this.f.equals(sz30Var.f) && u890.j(this.g, sz30Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        tv80 tv80Var = this.g;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
