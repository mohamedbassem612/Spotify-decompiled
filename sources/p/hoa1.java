package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hoa1 {
    public final String a;
    public final ajn0 b;
    public final String c;
    public final String d;
    public final String e;

    public hoa1(String str, ajn0 ajn0Var, String str2, String str3) {
        this.a = str;
        this.b = ajn0Var;
        this.c = str2;
        this.d = str3;
        this.e = cy30.l(str, '.', ajn0Var + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoa1)) {
            return false;
        }
        hoa1 hoa1Var = (hoa1) obj;
        return this.a.equals(hoa1Var.a) && this.b.equals(hoa1Var.b) && this.c.equals(hoa1Var.c) && this.d.equals(hoa1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return gvg.k(sb, this.d, ')');
    }
}
