package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iiw0 extends oiw0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final k4m f;

    public iiw0(String str, String str2, boolean z, boolean z2, boolean z3, k4m k4mVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = k4mVar;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiw0)) {
            return false;
        }
        iiw0 iiw0Var = (iiw0) obj;
        return u890.j(this.a, iiw0Var.a) && u890.j(this.b, iiw0Var.b) && this.c == iiw0Var.c && this.d == iiw0Var.d && this.e == iiw0Var.e && this.f == iiw0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
