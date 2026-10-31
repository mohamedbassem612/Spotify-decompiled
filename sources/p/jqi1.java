package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class jqi1 {
    public static final iqi1 Companion = new iqi1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ jqi1(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, hqi1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqi1)) {
            return false;
        }
        jqi1 jqi1Var = (jqi1) obj;
        return u890.j(this.a, jqi1Var.a) && u890.j(this.b, jqi1Var.b) && u890.j(this.c, jqi1Var.c) && u890.j(this.d, jqi1Var.d) && u890.j(this.e, jqi1Var.e) && u890.j(this.f, jqi1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public jqi1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
