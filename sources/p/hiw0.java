package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hiw0 extends oiw0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final k4m f = k4m.d;

    public hiw0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // p.oiw0
    public final String a() {
        return this.b;
    }

    @Override // p.oiw0
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiw0)) {
            return false;
        }
        hiw0 hiw0Var = (hiw0) obj;
        return u890.j(this.a, hiw0Var.a) && u890.j(this.b, hiw0Var.b) && this.c == hiw0Var.c && this.d == hiw0Var.d && this.e == hiw0Var.e && this.f == hiw0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
