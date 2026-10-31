package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jri0 implements kri0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public jri0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jri0)) {
            return false;
        }
        jri0 jri0Var = (jri0) obj;
        return this.a.equals(jri0Var.a) && u890.j(this.b, jri0Var.b) && u890.j(this.c, jri0Var.c) && this.d.equals(jri0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
