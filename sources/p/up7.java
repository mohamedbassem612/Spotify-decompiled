package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class up7 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public up7(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up7)) {
            return false;
        }
        up7 up7Var = (up7) obj;
        return this.a == up7Var.a && this.b.equals(up7Var.b) && this.c.equals(up7Var.c) && this.d.equals(up7Var.d) && this.e == up7Var.e && this.f.equals(up7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
