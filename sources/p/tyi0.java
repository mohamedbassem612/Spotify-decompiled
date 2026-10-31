package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tyi0 implements uyi0 {
    public final long a;

    public tyi0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyi0) && this.a == ((tyi0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
