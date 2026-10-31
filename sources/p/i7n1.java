package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i7n1 {
    public final byte a;
    public final long b;

    /* JADX WARN: Multi-variable type inference failed */
    public i7n1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i7n1)) {
            return false;
        }
        i7n1 i7n1Var = (i7n1) obj;
        return this.a == i7n1Var.a && this.b == i7n1Var.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append((int) this.a);
        sb.append(", eventTimestamp=");
        return pze0.h(this.b, "}", sb);
    }
}
