package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final vpb1 f;

    public k5h0(String str, String str2, String str3, String str4, int i, vpb1 vpb1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = vpb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5h0)) {
            return false;
        }
        k5h0 k5h0Var = (k5h0) obj;
        return this.a.equals(k5h0Var.a) && this.b.equals(k5h0Var.b) && this.c.equals(k5h0Var.c) && u890.j(this.d, k5h0Var.d) && this.e == k5h0Var.e && u890.j(this.f, k5h0Var.f);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ab80.k(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
