package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o820 {
    public final String a;
    public final r620 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public o820(String str, r620 r620Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = r620Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o820)) {
            return false;
        }
        o820 o820Var = (o820) obj;
        return this.a.equals(o820Var.a) && this.b == o820Var.b && this.c == o820Var.c && this.d == o820Var.d && this.e == o820Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
