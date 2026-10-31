package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v5u {
    public static final v5u d = new v5u(20, 10, 0.1f);
    public final byte a;
    public final float b;
    public final byte c;

    static {
        new v5u(10, 5, 0.2f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v5u(int i, int i2, float f) {
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

    public final cc91 a() {
        float f = this.b;
        return new cc91(this.a, this.c, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5u)) {
            return false;
        }
        v5u v5uVar = (v5u) obj;
        return this.a == v5uVar.a && Float.compare(this.b, v5uVar.b) == 0 && this.c == v5uVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + x0d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
