package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jdt {
    public static final jdt c = new jdt(0, 0);
    public final long a;
    public final long b;

    public jdt(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jdt) {
            jdt jdtVar = (jdt) obj;
            return yr80.b(this.a, jdtVar.a) && this.b == jdtVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
