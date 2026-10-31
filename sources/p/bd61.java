package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bd61 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ bd61(String str, int i, String str2, String str3, boolean z, String str4) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd61)) {
            return false;
        }
        bd61 bd61Var = (bd61) obj;
        return u890.j(this.a, bd61Var.a) && u890.j(this.b, bd61Var.b) && u890.j(this.c, bd61Var.c) && u890.j(this.d, bd61Var.d) && this.e == bd61Var.e && this.f == bd61Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public bd61(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }
}
