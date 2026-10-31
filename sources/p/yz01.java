package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yz01 implements j011 {
    public final String a;
    public final String b;
    public final tv80 c;

    public yz01(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz01)) {
            return false;
        }
        yz01 yz01Var = (yz01) obj;
        return u890.j(this.a, yz01Var.a) && u890.j(this.b, yz01Var.b) && u890.j(this.c, yz01Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
