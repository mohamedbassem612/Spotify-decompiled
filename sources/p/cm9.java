package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cm9 {
    public final float a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public cm9(float f, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm9)) {
            return false;
        }
        cm9 cm9Var = (cm9) obj;
        return Float.compare(this.a, cm9Var.a) == 0 && u890.j(this.b, cm9Var.b) && this.c.equals(cm9Var.c) && u890.j(this.d, cm9Var.d) && this.e == cm9Var.e && this.f == cm9Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
