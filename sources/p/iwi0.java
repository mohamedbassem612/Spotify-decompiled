package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iwi0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public iwi0(String str, String str2, String str3, String str4, String str5, String str6, d8r0 d8r0Var, boolean z) {
        this.a = str;
        this.b = d8r0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwi0)) {
            return false;
        }
        iwi0 iwi0Var = (iwi0) obj;
        return u890.j(this.a, iwi0Var.a) && this.b.equals(iwi0Var.b) && u890.j(this.c, iwi0Var.c) && u890.j(this.d, iwi0Var.d) && u890.j(this.e, iwi0Var.e) && u890.j(this.f, iwi0Var.f) && u890.j(this.g, iwi0Var.g) && this.h == iwi0Var.h;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(hrt.i(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
