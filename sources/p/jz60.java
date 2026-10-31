package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jz60 implements oz60 {
    public final fq0 a;
    public final String b;
    public final String c;
    public final String d;

    public jz60(fq0 fq0Var, String str, String str2, String str3) {
        this.a = fq0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz60)) {
            return false;
        }
        jz60 jz60Var = (jz60) obj;
        return this.a.equals(jz60Var.a) && this.b.equals(jz60Var.b) && this.c.equals(jz60Var.c) && u890.j(this.d, jz60Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
