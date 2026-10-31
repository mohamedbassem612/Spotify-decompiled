package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class re61 implements cf61 {
    public final j4e a;
    public final int b;
    public final int c;

    public re61(j4e j4eVar, int i, int i2) {
        this.a = j4eVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re61)) {
            return false;
        }
        re61 re61Var = (re61) obj;
        return this.a.equals(re61Var.a) && this.b == re61Var.b && this.c == re61Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
