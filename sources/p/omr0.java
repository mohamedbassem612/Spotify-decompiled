package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class omr0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public omr0(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omr0)) {
            return false;
        }
        omr0 omr0Var = (omr0) obj;
        return this.a.equals(omr0Var.a) && this.b == omr0Var.b && this.c == omr0Var.c && this.d == omr0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
