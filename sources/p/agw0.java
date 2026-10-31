package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class agw0 extends up30 {
    public final String c;
    public final String d;
    public final String e;
    public final tv80 f;

    public agw0(String str, String str2, String str3, tv80 tv80Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agw0)) {
            return false;
        }
        agw0 agw0Var = (agw0) obj;
        return this.c.equals(agw0Var.c) && this.d.equals(agw0Var.d) && this.e.equals(agw0Var.e) && u890.j(this.f, agw0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        tv80 tv80Var = this.f;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
