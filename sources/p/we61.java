package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class we61 implements cf61 {
    public final j4e a;
    public final int b;
    public final int c;

    public we61(j4e j4eVar, int i, int i2) {
        this.a = j4eVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we61)) {
            return false;
        }
        we61 we61Var = (we61) obj;
        return this.a.equals(we61Var.a) && this.b == we61Var.b && this.c == we61Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
