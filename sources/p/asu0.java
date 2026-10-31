package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class asu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final qff g;

    public asu0(String str, String str2, String str3, String str4, String str5, boolean z, qff qffVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = qffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof asu0) {
            asu0 asu0Var = (asu0) obj;
            return u890.j(this.a, asu0Var.a) && this.b.equals(asu0Var.b) && this.c.equals(asu0Var.c) && u890.j(this.d, asu0Var.d) && this.e.equals(asu0Var.e) && this.f == asu0Var.f && this.g == asu0Var.g;
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.g.hashCode() + xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
