package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ml6 implements nl6 {
    public final long a;

    public ml6(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml6) && this.a == ((ml6) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
