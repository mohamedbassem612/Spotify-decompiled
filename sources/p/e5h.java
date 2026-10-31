package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e5h {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final c380 e;
    public final boolean f;
    public final String g;
    public final String h;
    public final c5h i;
    public final boolean j;

    public e5h(String str, int i, String str2, boolean z, c380 c380Var, boolean z2, String str3, String str4, c5h c5hVar, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = c380Var;
        this.f = z2;
        this.g = str3;
        this.h = str4;
        this.i = c5hVar;
        this.j = z3;
    }

    public static e5h a(e5h e5hVar, boolean z, c380 c380Var, boolean z2, String str, c5h c5hVar, boolean z3, int i) {
        String str2 = e5hVar.a;
        int i2 = e5hVar.b;
        String str3 = e5hVar.c;
        e5hVar.getClass();
        e5hVar.getClass();
        e5hVar.getClass();
        if ((i & 64) != 0) {
            z = e5hVar.d;
        }
        boolean z4 = z;
        e5hVar.getClass();
        if ((i & 256) != 0) {
            c380Var = e5hVar.e;
        }
        c380 c380Var2 = c380Var;
        if ((i & 512) != 0) {
            z2 = e5hVar.f;
        }
        boolean z5 = z2;
        e5hVar.getClass();
        String str4 = e5hVar.g;
        if ((i & 4096) != 0) {
            str = e5hVar.h;
        }
        e5hVar.getClass();
        return new e5h(str2, i2, str3, z4, c380Var2, z5, str4, str, c5hVar, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5h)) {
            return false;
        }
        e5h e5hVar = (e5h) obj;
        return u890.j(this.a, e5hVar.a) && this.b == e5hVar.b && this.c.equals(e5hVar.c) && this.d == e5hVar.d && u890.j(this.e, e5hVar.e) && this.f == e5hVar.f && this.g.equals(e5hVar.g) && this.h.equals(e5hVar.h) && this.i == e5hVar.i && this.j == e5hVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + cy30.d(cy30.d(xcg1.g(xcg1.g(kk0.f(this.e, xcg1.g(xcg1.g(cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 29791, this.c), 31, false), 961, this.d), 31), 31, this.f), 31, false), 31, this.g), 31, this.h)) * 31);
    }
}
