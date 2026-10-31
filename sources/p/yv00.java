package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yv00 {
    public final c481 a;
    public final int b;

    public yv00(c481 c481Var, int i) {
        this.a = c481Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv00)) {
            return false;
        }
        yv00 yv00Var = (yv00) obj;
        return this.a.equals(yv00Var.a) && this.b == yv00Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
