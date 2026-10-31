package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h4c1 {
    public final String a;
    public final String b;
    public final tv80 c;

    public h4c1(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4c1)) {
            return false;
        }
        h4c1 h4c1Var = (h4c1) obj;
        return this.a.equals(h4c1Var.a) && this.b.equals(h4c1Var.b) && u890.j(this.c, h4c1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
