package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class msh1 {
    public final String a;
    public final String b;
    public final ith1 c;

    public msh1(String str, String str2, ith1 ith1Var) {
        this.a = str;
        this.b = str2;
        this.c = ith1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msh1)) {
            return false;
        }
        msh1 msh1Var = (msh1) obj;
        return this.a.equals(msh1Var.a) && u890.j(this.b, msh1Var.b) && u890.j(this.c, msh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
