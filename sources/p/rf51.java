package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rf51 {
    public final long a;
    public final flb b;

    public rf51(long j, flb flbVar) {
        this.a = j;
        this.b = flbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf51)) {
            return false;
        }
        rf51 rf51Var = (rf51) obj;
        return this.a == rf51Var.a && this.b.equals(rf51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
