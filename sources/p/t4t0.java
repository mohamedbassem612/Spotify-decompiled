package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t4t0 extends v4t0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k3h1 e;
    public final String f;

    public t4t0(String str, String str2, String str3, String str4, k3h1 k3h1Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = k3h1Var;
        this.f = str5;
    }

    @Override // p.v4t0
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4t0)) {
            return false;
        }
        t4t0 t4t0Var = (t4t0) obj;
        return this.a.equals(t4t0Var.a) && this.b.equals(t4t0Var.b) && this.c.equals(t4t0Var.c) && this.d.equals(t4t0Var.d) && this.e.equals(t4t0Var.e) && u890.j(this.f, t4t0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kaa0.f(this.e.b, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
