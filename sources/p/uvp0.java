package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uvp0 implements vvp0 {
    public final long a;

    public uvp0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvp0) && this.a == ((uvp0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
