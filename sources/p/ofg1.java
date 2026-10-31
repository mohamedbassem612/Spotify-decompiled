package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ofg1 {
    public static final long b = sgc1.u(0.5f, 0.5f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return gvg.f(j, "TransformOrigin(packedValue=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ofg1) {
            return this.a == ((ofg1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
