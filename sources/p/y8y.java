package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y8y {
    public final x8y a;
    public final long b;

    public y8y(x8y x8yVar, long j) {
        this.a = x8yVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8y)) {
            return false;
        }
        y8y y8yVar = (y8y) obj;
        return this.a.equals(y8yVar.a) && this.b == y8yVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
