package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pru0 implements uru0 {
    public final long a;

    public pru0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pru0) && this.a == ((pru0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
