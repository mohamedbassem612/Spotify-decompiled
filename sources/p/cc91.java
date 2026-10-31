package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cc91 {
    public final byte a;
    public final float b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public cc91(int i, int i2, float f) {
        this.a = i;
        this.b = f;
        this.c = i2;
        if (i <= 0) {
            hhg1.n("windowSize must be positive");
            throw null;
        }
        if (0.0f > f || f > 1.0f) {
            hhg1.n("slideThreshold must be in [0, 1]");
            throw null;
        }
        if (1 > i2 || i2 > i) {
            hhg1.n("slideStep must be in [1, windowSize]");
            throw null;
        }
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc91)) {
            return false;
        }
        cc91 cc91Var = (cc91) obj;
        return this.a == cc91Var.a && Float.compare(this.b, cc91Var.b) == 0 && this.c == cc91Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + x0d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
