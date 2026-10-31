package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d5h {
    public final String a;
    public final int b;
    public final c380 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final c5h h;

    public d5h(String str, int i, c380 c380Var, boolean z, boolean z2, String str2, String str3, c5h c5hVar) {
        this.a = str;
        this.b = i;
        this.c = c380Var;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = str3;
        this.h = c5hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5h)) {
            return false;
        }
        d5h d5hVar = (d5h) obj;
        return u890.j(this.a, d5hVar.a) && this.b == d5hVar.b && u890.j(this.c, d5hVar.c) && this.d == d5hVar.d && this.e == d5hVar.e && this.f.equals(d5hVar.f) && this.g.equals(d5hVar.g) && this.h == d5hVar.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(cy30.d(xcg1.g(xcg1.g(kk0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
