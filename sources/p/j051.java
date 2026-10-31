package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j051 extends l051 {
    public final String a;
    public final String b;
    public final tv80 c;

    public j051(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    @Override // p.l051
    public final String a() {
        return this.a;
    }

    @Override // p.l051
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j051)) {
            return false;
        }
        j051 j051Var = (j051) obj;
        return u890.j(this.a, j051Var.a) && this.b.equals(j051Var.b) && u890.j(this.c, j051Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return gyh.b.hashCode() + ((iD + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
