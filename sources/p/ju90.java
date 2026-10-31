package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ju90 implements lu90 {
    public final long a;

    public ju90(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju90) && this.a == ((ju90) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
