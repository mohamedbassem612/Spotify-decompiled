package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u3z implements jl20 {
    public final String a;
    public final d8r0 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;

    public u3z(String str, d8r0 d8r0Var, String str2, String str3, String str4, int i, String str5) {
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
        if (!(obj instanceof u3z)) {
            return false;
        }
        u3z u3zVar = (u3z) obj;
        return this.a.equals(u3zVar.a) && this.b.equals(u3zVar.b) && u890.j(this.c, u3zVar.c) && u890.j(this.d, u3zVar.d) && u890.j(this.e, u3zVar.e) && this.f == u3zVar.f && u890.j(this.g, u3zVar.g);
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
