package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pbk0 {
    public final nbk0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pbk0(nbk0 nbk0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = nbk0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbk0)) {
            return false;
        }
        pbk0 pbk0Var = (pbk0) obj;
        return this.a.equals(pbk0Var.a) && this.b == pbk0Var.b && this.c == pbk0Var.c && this.d == pbk0Var.d && this.e == pbk0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
