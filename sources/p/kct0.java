package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kct0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public kct0(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kct0)) {
            return false;
        }
        kct0 kct0Var = (kct0) obj;
        return u890.j(this.a, kct0Var.a) && u890.j(this.b, kct0Var.b) && u890.j(this.c, kct0Var.c) && u890.j(this.d, kct0Var.d) && u890.j(this.e, kct0Var.e) && u890.j(this.f, kct0Var.f) && this.g == kct0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
