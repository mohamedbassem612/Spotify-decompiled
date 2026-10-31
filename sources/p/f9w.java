package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f9w extends iiw {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final tv80 e;

    public f9w(int i, String str, String str2, String str3, tv80 tv80Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9w)) {
            return false;
        }
        f9w f9wVar = (f9w) obj;
        return this.a == f9wVar.a && u890.j(this.b, f9wVar.b) && u890.j(this.c, f9wVar.c) && u890.j(this.d, f9wVar.d) && u890.j(this.e, f9wVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        tv80 tv80Var = this.e;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
