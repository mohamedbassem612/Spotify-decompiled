package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yiw0 implements bjw0 {
    public final long a;
    public final float b;

    public yiw0(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final long a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiw0)) {
            return false;
        }
        yiw0 yiw0Var = (yiw0) obj;
        return this.a == yiw0Var.a && Float.compare(this.b, yiw0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
