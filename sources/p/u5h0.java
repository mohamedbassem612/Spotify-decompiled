package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public u5h0(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5h0)) {
            return false;
        }
        u5h0 u5h0Var = (u5h0) obj;
        return this.a.equals(u5h0Var.a) && this.b.equals(u5h0Var.b) && this.c.equals(u5h0Var.c) && this.d.equals(u5h0Var.d) && this.e == u5h0Var.e;
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31, this.d);
    }
}
