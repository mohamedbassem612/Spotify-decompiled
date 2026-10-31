package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vt30 implements zul1 {
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final String e;
    public final String f;

    static {
        zy61 zy61Var = ez61.c;
    }

    public vt30(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, String str, String str2) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt30)) {
            return false;
        }
        vt30 vt30Var = (vt30) obj;
        return this.a == vt30Var.a && u890.j(this.b, vt30Var.b) && u890.j(this.c, vt30Var.c) && u890.j(this.d, vt30Var.d) && u890.j(this.e, vt30Var.e) && u890.j(this.f, vt30Var.f);
    }

    public final String getEntityUri() {
        return this.d.a;
    }

    public final int hashCode() {
        int iD = cy30.d((this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31, 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
