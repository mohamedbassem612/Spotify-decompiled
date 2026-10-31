package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w7f {
    public final long a;
    public final int b;

    public w7f(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7f)) {
            return false;
        }
        w7f w7fVar = (w7f) obj;
        return this.a == w7fVar.a && this.b == w7fVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
