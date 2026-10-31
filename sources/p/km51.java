package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class km51 {
    public final long a;
    public final long b;
    public final boolean c;

    public km51(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j <= j2;
        Math.abs(j2 - j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km51)) {
            return false;
        }
        km51 km51Var = (km51) obj;
        return this.a == km51Var.a && this.b == km51Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
