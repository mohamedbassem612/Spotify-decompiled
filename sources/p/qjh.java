package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qjh {
    public final short a;
    public final boolean b;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public qjh(long j, boolean z) {
        this.a = (int) j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjh)) {
            return false;
        }
        qjh qjhVar = (qjh) obj;
        return ((long) this.a) == ((long) qjhVar.a) && this.b == qjhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
