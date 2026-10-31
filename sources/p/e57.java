package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e57 implements e0x {
    public final long a;

    public e57(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e57) && yr80.b(this.a, ((e57) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
