package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nr90 {
    public final c380 a;
    public final int b;
    public final int c;

    public nr90(c380 c380Var, int i, int i2) {
        this.a = c380Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr90)) {
            return false;
        }
        nr90 nr90Var = (nr90) obj;
        return u890.j(this.a, nr90Var.a) && this.b == nr90Var.b && this.c == nr90Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
