package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0m {
    public final String a;
    public final c380 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public w0m(String str, c380 c380Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = c380Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static w0m a(w0m w0mVar, String str, c380 c380Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            str = w0mVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            c380Var = w0mVar.b;
        }
        c380 c380Var2 = c380Var;
        if ((i & 4) != 0) {
            z = w0mVar.c;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = w0mVar.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = w0mVar.e;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = w0mVar.f;
        }
        return new w0m(str2, c380Var2, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0m)) {
            return false;
        }
        w0m w0mVar = (w0m) obj;
        return this.a.equals(w0mVar.a) && u890.j(this.b, w0mVar.b) && this.c == w0mVar.c && this.d == w0mVar.d && this.e == w0mVar.e && this.f == w0mVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
