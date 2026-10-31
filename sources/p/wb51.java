package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wb51 {
    public final long a;

    public /* synthetic */ wb51(long j) {
        this.a = j;
    }

    public static final /* synthetic */ wb51 a(long j) {
        return new wb51(j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb51) {
            return this.a == ((wb51) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "PageMeasurement(generation=", ")");
    }
}
