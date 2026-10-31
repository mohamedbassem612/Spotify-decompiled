package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class arx0 extends frx0 {
    public final long a;
    public final boolean b;

    public arx0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arx0)) {
            return false;
        }
        arx0 arx0Var = (arx0) obj;
        return this.a == arx0Var.a && this.b == arx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
