package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class klk extends vlk {
    public final long a;

    public klk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klk) && this.a == ((klk) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
