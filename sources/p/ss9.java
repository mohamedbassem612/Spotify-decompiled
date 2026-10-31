package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ss9 {
    public final float a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public ss9(float f, String str, String str2, String str3, boolean z) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss9)) {
            return false;
        }
        ss9 ss9Var = (ss9) obj;
        return Float.compare(this.a, ss9Var.a) == 0 && u890.j(this.b, ss9Var.b) && this.c.equals(ss9Var.c) && u890.j(this.d, ss9Var.d) && this.e == ss9Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
