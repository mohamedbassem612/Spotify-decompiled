package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rt10 implements st10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rt10(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt10)) {
            return false;
        }
        rt10 rt10Var = (rt10) obj;
        return this.a.equals(rt10Var.a) && u890.j(this.b, rt10Var.b) && this.c.equals(rt10Var.c) && u890.j(this.d, rt10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
