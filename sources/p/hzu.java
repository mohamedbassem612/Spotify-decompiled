package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hzu {
    public final int a;
    public final int b;
    public final boolean c;

    public hzu(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzu)) {
            return false;
        }
        hzu hzuVar = (hzu) obj;
        return this.a == hzuVar.a && this.b == hzuVar.b && this.c == hzuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
