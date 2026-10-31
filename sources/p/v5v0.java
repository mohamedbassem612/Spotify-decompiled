package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v5v0 implements jl20 {
    public final String a;
    public final d8r0 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;

    public v5v0(String str, d8r0 d8r0Var, String str2, String str3, String str4, int i, String str5) {
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
        if (!(obj instanceof v5v0)) {
            return false;
        }
        v5v0 v5v0Var = (v5v0) obj;
        return this.a.equals(v5v0Var.a) && this.b.equals(v5v0Var.b) && u890.j(this.c, v5v0Var.c) && u890.j(this.d, v5v0Var.d) && u890.j(this.e, v5v0Var.e) && this.f == v5v0Var.f && u890.j(this.g, v5v0Var.g);
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
