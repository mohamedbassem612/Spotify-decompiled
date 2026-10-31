package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nnp0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public nnp0(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnp0)) {
            return false;
        }
        nnp0 nnp0Var = (nnp0) obj;
        return this.a == nnp0Var.a && u890.j(this.b, nnp0Var.b) && u890.j(this.c, nnp0Var.c) && u890.j(this.d, nnp0Var.d) && u890.j(this.e, nnp0Var.e) && u890.j(this.f, nnp0Var.f) && this.g.equals(nnp0Var.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
