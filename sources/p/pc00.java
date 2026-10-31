package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pc00 {
    public final oc00 a;
    public final long b;
    public final long c;

    public pc00(oc00 oc00Var, long j, long j2) {
        this.a = oc00Var;
        this.b = j;
        this.c = j2;
    }

    public final oc00 a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc00)) {
            return false;
        }
        pc00 pc00Var = (pc00) obj;
        return this.a == pc00Var.a && this.b == pc00Var.b && this.c == pc00Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
