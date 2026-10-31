package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class te61 implements cf61 {
    public final j4e a;
    public final int b;
    public final int c;

    public te61(j4e j4eVar, int i, int i2) {
        this.a = j4eVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te61)) {
            return false;
        }
        te61 te61Var = (te61) obj;
        return this.a.equals(te61Var.a) && this.b == te61Var.b && this.c == te61Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
