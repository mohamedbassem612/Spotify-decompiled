package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jqa implements z6h {
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final String e;
    public final String f;
    public final String g;

    static {
        zy61 zy61Var = ez61.c;
    }

    public jqa(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, String str, String str2, String str3) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final wa71 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqa)) {
            return false;
        }
        jqa jqaVar = (jqa) obj;
        return this.a == jqaVar.a && u890.j(this.b, jqaVar.b) && u890.j(this.c, jqaVar.c) && u890.j(this.d, jqaVar.d) && u890.j(this.e, jqaVar.e) && u890.j(this.f, jqaVar.f) && u890.j(this.g, jqaVar.g);
    }

    public final String getEntityUri() {
        return this.d.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
