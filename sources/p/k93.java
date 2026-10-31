package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k93 implements jl20 {
    public final String a;
    public final d8r0 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;

    public k93(String str, d8r0 d8r0Var, String str2, String str3, String str4, int i, String str5) {
        this.a = str;
        this.b = d8r0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
    }

    public final d8r0 a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k93)) {
            return false;
        }
        k93 k93Var = (k93) obj;
        return this.a.equals(k93Var.a) && this.b.equals(k93Var.b) && u890.j(this.c, k93Var.c) && u890.j(this.d, k93Var.d) && u890.j(this.e, k93Var.e) && this.f == k93Var.f && u890.j(this.g, k93Var.g);
    }

    public final String getId() {
        return this.a;
    }

    public final int getPosition() {
        return this.f;
    }

    public final String getRequestId() {
        return this.c;
    }

    public final String getUri() {
        return this.d;
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(this.f, cy30.d(cy30.d(cy30.d(hrt.i(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
