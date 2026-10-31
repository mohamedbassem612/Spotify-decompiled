package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bd9 implements ed9 {
    public final long a;

    public bd9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd9) && this.a == ((bd9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
